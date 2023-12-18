/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in =new Scanner(System.in);
	    int n=in.nextInt();
	    double[] p=new double[n];
	    for(int i=0;i<n;i++)p[i]=in.nextDouble();
	    double[][] a=new double[n][n+1];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n+1;j++)a[i][j]=0;
	    }
	    a[0][1]=p[0];
	    a[0][0]=1-p[0];
	    for(int i=1;i<n;i++){
	        a[i][0]=a[i-1][0]*(1-p[i]);
	        for(int j=1;j<=i+1;j++){
	            a[i][j]=a[i-1][j-1]*p[i]+a[i-1][j]*(1-p[i]);
	        }
	    }
	    double ans=0;
	    int k= n/2+1;
	    for(int i=k;i<n+1;i++){
	        ans+=a[n-1][i];
	    }
	    System.out.println(ans);
	}
}
