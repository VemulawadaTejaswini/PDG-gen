/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int [] A = new int[n];
        for(int i=0; i<n; i++ ) 
         A[i] = s.nextInt();
         
        int q = s.nextInt();
    int bc[][]=new int[q][2];
    for(int i=0;i<q;i++)
    {
      bc[i][0]=s.nextInt(); 
      bc[i][1]=s.nextInt();
    }
     for(int i=0;i<q;i++)
      { int sum=0;
           A[bc[i][0]-1]=A[bc[i][1]-1];
	    for(int j=0;j<n;j++)
	    sum+=A[j];
	    System.out.println(sum);
	
      }
	}
}