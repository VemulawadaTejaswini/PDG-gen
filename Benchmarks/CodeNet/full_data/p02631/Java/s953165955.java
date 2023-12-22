/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class MAIN {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int [] A = new int[n]; int xor=0;
        for(int i=0; i<n; i++ ) 
        { A[i] = s.nextInt();
         
       xor=myXOR(xor,A[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(myXOR(xor,A[i])+ " ");
        }
	}
	static int myXOR(int x, int y) 
{ 
return (x & (~y)) | ((~x )& y); 
} 
  
}