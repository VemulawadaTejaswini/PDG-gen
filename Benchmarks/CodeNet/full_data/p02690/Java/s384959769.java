


import java.io.*;

import java.util.*;

class pair{
	int a ;int b;
	public pair(int a,int b){
		this.a=a;
		this.b=b;
	}}

public class Main {
	
	 static long fun(long n,int i) 
	    { 
	         return (long)Math.pow(n,i);
	    } 

	public static void main(String[] args) throws IOException 
	{ 
		Scanner s=new Scanner(System.in);
		long x=s.nextLong();
		long a=0;
		long b=0;
		boolean fl=false;
		for (int i = 0; i < 10000; i++) {
			a=i;
			for (int j = 0; j < 10000; j++) {
				
				b=j;
			long tt1=(a-b)*(fun(a,4) + fun(a,3)*b + fun(a,2)*fun(b,2) + a*fun(b,3) + fun(b,4));
			long tt2=(a+b)*(fun(a,4) - fun(a,3)*b + fun(a,2)*fun(b,2) - a*fun(b,3) + fun(b,4));
				if(tt1==x) {
					System.out.println(a+" "+b);
					return;
				}
				if(tt2==x) {
					System.out.println(a+" "+-b);
					return;
					
				}
			}
		}

	}


}