

import java.util.*;
import java.lang.*;
import java.io.*;


public class Ideone
{
	 static int ans=0;
	 static int m;
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner in = new Scanner(System.in);
		 m=in.nextInt();
		 generate(0,0,0,0);
		  System.out.println(ans);
	}
	static void generate(long n,int s,int f,int t){
	if(n>m) {
		return;
	}
	if(s>=1&&f>=1&&t>=1) {
		ans++;
	
	}
	generate(n*10+7,s+1,f,t);
	generate(n*10+5,s,f+1,t);
	generate(n*10+3,s,f,t+1);
}
}