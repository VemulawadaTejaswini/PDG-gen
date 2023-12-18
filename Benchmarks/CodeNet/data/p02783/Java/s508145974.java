/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(b>a){
			System.out.println(1);
	}
	else if ((a%b)!=0){
		int c = a/b + 1;
		System.out.println(c);
	}
	else System.out.println(a/b);
}

}