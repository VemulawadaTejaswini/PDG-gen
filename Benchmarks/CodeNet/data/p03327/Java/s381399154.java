import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if (n <= 999){
			System.out.println("ABC");
		}
		else{
			System.out.println("ABD");	
		}
	}
}