/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
	    int[] h=new int[n+1];
	    for(int i=1;i<=n;i++)
	        h[i]=input.nextInt();
	   int count=0;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=i+1;j<=n;j++)
	        {
	            if((j-i)==(h[i]+h[j]))
	                count++;
	        }
	    }
	    System.out.println(count);
		  input.close();
	}
}