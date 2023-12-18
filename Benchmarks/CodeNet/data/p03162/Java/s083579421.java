/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][] a=new int [n][3];
		int [][] ans=new int [n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		ans[0][0]=a[0][0];
		ans[0][1]=a[0][1];
		ans[0][2]=a[0][2];
		for(int i=1;i<n;i++)
		{
			ans[i][0]=a[i][0]+Math.max(ans[i-1][1],ans[i-1][2]);
			ans[i][1]=a[i][1]+Math.max(ans[i-1][0],ans[i-1][2]);
			ans[i][2]=a[i][2]+Math.max(ans[i-1][1],ans[i-1][0]);
		}
		int ans1=Math.max(ans[n-1][0],Math.max(ans[n-1][1],ans[n-1][2]));
		System.out.println(ans1);
	}
}