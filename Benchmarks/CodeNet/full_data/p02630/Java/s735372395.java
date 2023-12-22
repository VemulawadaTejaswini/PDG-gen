/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int [] A = new int[n];
        for(int i=0; i<n; i++ ) 
         A[i] = s.nextInt();
         
        int q = s.nextInt();int b=0,c=0;
 
     for(int i=0;i<q;i++)
      { int sum=0;
       b=s.nextInt(); 
      c=s.nextInt();
      for(int j=0;j<n;j++)
          { if(A[j]==b)
             A[j] =c;
	         sum+=A[j];
          }
	    System.out.println(sum);
	
      }
	}
}
