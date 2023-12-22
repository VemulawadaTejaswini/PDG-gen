//package Contest169;


import java.util.*;
import java.io.*;
import java.math.*;

import java.math.*;
class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Start here:
        
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        
        long a[]=new long[t];
        
        
        for(int i=0;i<t;i++)
        {
        	a[i]=sc.nextLong();
        }
        
        BigInteger b=new BigInteger("1000000000000000000");
        BigInteger ans=BigInteger.ONE;
        //long ans=1L;
        boolean flag=true;
        for(int i=0;i<t;i++)
        {
        	BigInteger bb=new BigInteger(Long.toString(a[i]));
        	
        	//System.out.println(ans);
        	ans=ans.multiply(bb);
        }

        	if(ans.compareTo(b)==1)
        	{
        		System.out.println(-1);
        	}
        	else
        	{
        		System.out.println(ans.toString());
        	}
  

    }
}