

import java.util.*;
import java.io.*;

class Main {
//2 1 1 3
	//2000000000 0 0 
	//2000000000	
	
	public static void main(String[] args)  throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		long a=Long.parseLong(s[0]);
		long b=Long.parseLong(s[1]);
		long c=Long.parseLong(s[2]);
		long k=Long.parseLong(s[3]);
		
		if(a>=k)
		{
			System.out.println(k);
		}
		else
		{
			long sum=0;
			
			sum = sum + (a)*1;
			
			k=k-a;
			//System.out.println(k);
			
			k=k-b;
			//System.out.println(k);
			
			if(k>0)
			{
				sum=sum-k*1;
			}
			
			System.out.println(sum);
			/*
			//long sum=0;
			while(k>0)
			{
				//long sum=0;
				long r=a%k;
				sum=sum+(1*r);
				
				k=k-r;
				
				long r1=b%k;
				sum=sum+(0*r);
				
				k=k-r1;
				
				long r2=c%k;
				sum=sum+(0*)
			}
			*/
			
			
			
			
		}
		
		
		
		
	}

}
