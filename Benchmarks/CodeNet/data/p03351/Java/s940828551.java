/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner inti = new Scanner(System.in);
		int a = inti.nextInt();
		int b = inti.nextInt();
		int c = inti.nextInt();
		int d = inti.nextInt();
		int d1 = b-a;
		int d2 = c-b;
		int d3 = c-a;
		if(d1<0){
			d1 = d1*-1;
		}
		if(d2<0){
			d2 = d2*-1;
		}
		if(d3<0){
			d3 = d3*-1;
		}
		if(d3<=d){
			System.out.println("Yes");
		}
		else if(d2<=d && d1<=d){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
