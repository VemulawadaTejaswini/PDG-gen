/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),
		    k=in.nextInt();
		    
		double value[]=new double[n];
		
		for(int i=0; i<n; i++)
            value[i]=(in.nextInt()+1.0)/2.0;
            
        double sum=0.0, max;
        for(int i=0; i<k; i++)
            sum+=value[i];
            
        max=sum;
        
        for(int i=k; i<n; i++) {
            sum+=value[i];
            sum-=value[i-k];
            max=Math.max(max, sum);
        }
        
        System.out.println(max);
	}
}
