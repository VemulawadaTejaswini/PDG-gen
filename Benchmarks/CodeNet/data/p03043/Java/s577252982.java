/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		double p = 1.0/n;
		double ans=0.0;
		for(int i=1;i<=n;i++){
			double calc = p;
			for(int j=i;j<=k;j*=2){
				calc *= (0.5);
			}
			ans += calc;
		}

		System.out.println(ans);
		
	}}