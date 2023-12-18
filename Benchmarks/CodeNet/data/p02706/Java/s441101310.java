/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


public class Main {
     
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	long n=s.nextLong();
	int m=s.nextInt();
	long sum=0;
	for(int i=0;i<m;i++)
	sum+=s.nextLong();
	if(sum>n)
	System.out.println("-1");
	else 
	System.out.println(n-sum);
	}
}