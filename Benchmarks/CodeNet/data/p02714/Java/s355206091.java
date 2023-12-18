/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String c=s.next();
	long ans=0;
	for(int i=0;i<n;i++)
	{for(int j=i+1;j<n;j++)
	{if(c.charAt(i)!=c.charAt(j))
	{for(int k=j+1;k<n;k++)
	{if((k-j)!=(j-i) && c.charAt(i)!=c.charAt(k) && c.charAt(j)!=c.charAt(k))
	ans++;
	}}}}
	System.out.println(ans);
	}
}