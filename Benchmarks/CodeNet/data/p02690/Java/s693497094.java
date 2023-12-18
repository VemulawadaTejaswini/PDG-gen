/*package whatever //do not write package name here */
import java.util.*;
import java.lang.Math;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
		Scanner input=new Scanner(System.in);
		double n=input.nextDouble();
		outer:for(double i=0;i<=100000;i++)
		{
		    for(double j=-100000;j<=100000;j++)
		    {
		        if((Math.pow(i,5)-Math.pow(j,5))==n)
		        {
		            System.out.println((int)i + " " + (int)j);
		            break outer;
		        }
		    }
		}
		input.close();
	}
}