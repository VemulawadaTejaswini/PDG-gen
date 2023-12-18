/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long a = input.nextLong();
		long b = input.nextLong();
		
		int g = 0;
		if(a==0)
		    System.out.println(0);
		else{
    		while(n>0)
    		{
    		    n=n-a;
    		    if(n<0)
    		        break;
    		    g++;
    		    n=n-b;
    		    if(n<0)
    		        break;
    		    g++;
    		}
    		if(n==0)
    		{
    		    if(g%2==0)
    		        System.out.println((g/2)*a);
    		    else
    		    {
    		        System.out.println(((g+1)/2)*a);
    		    }
    		}
    		else{
    		    long fin = (g/2)*a+(a+n);
    		    System.out.println(fin);
    		}
		}
	}
}