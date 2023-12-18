/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
    private static final long MOD = (long)(1e9+7);
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++)
		    a[i] = input.nextLong();
		    
		long xor=0l,sum=0l;
		for(int i=0;i<n-1;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        xor = (a[i]^a[j])%MOD;
		        sum+=(xor%MOD);
		    }
		}
		System.out.println(sum%MOD);
	}
}