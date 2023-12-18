/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long yy=compu(s,0,s.length()-1);
		System.out.println(yy);
	}
	public static long compu(String s,int i,int j)
	{
	    if(i>j||i>=s.length())
	    return 0;
	    if(i==j)
	    return s.charAt(i)-'0';
	    else
	    {
	        long sd=0;
	        for(int x=i;x<=j;x++)
	        {
	            if(j>x)
	            sd=sd+(j-x)*(Long.parseLong(s.substring(i,x+1)))+compu(s,x+1,j);
	            else
	            sd+=Long.parseLong(s.substring(i,x+1));
	        }
	        return sd;
	    }
	}
}