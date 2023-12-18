/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class Main {
     
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n+1];
	for(int i=0;i<n-1;i++)
	{int k=s.nextInt();
	a[k]++;}
	for(int i=1;i<=n;i++)
	System.out.println(a[i]);
	}
}