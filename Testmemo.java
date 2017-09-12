package assignment4;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//as pacakge we are taking testmemo because the program is to print marks in memo pattern
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program
public class Testmemo {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//declares a class called Testmemo.
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		//System.out.println(Integer.parseInt(args[0]));//we are checking whether we gave zero or not 
		//int n1=Integer.parseInt(args[0]);
		//system : is a class in java language pacakge.
				//out : static member of the system class.
				//println : to print what is output.
		
			int n1 = 0;//to initialize the variables.
	      if(n1==0){
	 //using if loop checking that if it is equal to zero it shows that we have entered zero
	    	  System.out.println("you have entered zero");
	    	  //system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.

	      String char1=null;
	      //taking ASCII value ha null it prints as null
	      System.out.println("ASCII value of n is"+(char1));
	    //system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
	 //prints the ASCII value
	      }
		else if(n1<0)
	//if we pass negative arguments it will show negative value
		{
			System.out.println("you have entered negative values");
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
		}else////to test various conditions
		{
			//positive arguments
			System.out.println("you have entered positive values");
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
		}
	   Scanner in=new Scanner(System.in);//we are using scanner to initialize the input values
	    
	   System.out.print("Enter the marks of Physics");
	 //system : is a class in java language pacakge.
	 		//out : static member of the system class.
	 		//println : to print what is output.
	   int num1=in.nextInt();
	   
	   System.out.print("Enter the marks of Chemistry");
	   		//system : is a class in java language pacakge.
	 		//out : static member of the system class.
	 		//println : to print what is output.

	   int num2=in.nextInt();
	   
	   System.out.print("Enter the marks of Maths");
	 //system : is a class in java language pacakge.
	 //out : static member of the system class.
	 //println : to print what is output.
	   int num3=in.nextInt();
	    
	   int physics=num1,chemistry=num2,maths=num3,average;
	   //after intializing the marks it calculate the average value
	   
	   average=(physics+chemistry+maths)/3;
	    if(average>=70)
	    	//here we are using if average grater than or equal to 70
	    {
	    	//if the value is equal to input then it show the grade
	    	System.out.println("Grade A");
	    	//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.

	    }
	    if((average>=60) && (average<70))
	    {
	    	System.out.println("Grade B");
	    	//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.

	    }
	    if(average<60)//if average grater than or equal to 60
	    {
	    	System.out.println("Grade C");
	    	//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.

	    }
			}    
	    
	}


