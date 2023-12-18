import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    if(x==3 || x==5 || x==7){
	        System.out.println("YES");
	    }
	    else{
	        System.out.println("NO");
	    }
	}
}
