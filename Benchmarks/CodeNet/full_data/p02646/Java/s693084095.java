//package ARC12020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc =new Scanner(System.in);
        int x1=sc.nextInt();
        int v1=sc.nextInt();
        int x2=sc.nextInt();
        int v2=sc.nextInt();
        int t=sc.nextInt();
        
        if(x1<x2 && v1<v2)
        {
        	System.out.println("NO");
        	return;
        }
        else if(x2<x1 && v2<v1)
        {
        	System.out.println("NO");
        }
        else if(v2!=v1)
        {
        	if((x2-x1)%(v1-v2)==0)
        	{
        		System.out.println("YES");
        	}
        	else
        	{
        		System.out.println("NO");
        	}
        	return;
        }
        
        /*
        else if(x1<x2 && v1>v2)
        {
        	int tt=0;
        	while(tt<t)
        	{
        		x1=x1+v1;
        		x2=x2+v2;
        		if(x1==x2)
        		{
        			System.out.println("YES");
        			return;
        		}
        		tt++;
        	}
        	if(x1==x2)
    		{
    			System.out.println("YES");
    			return;
    		}
        	else
        	{
        		System.out.println("NO");
    			return;
        	}
        	
        }
        else if(x2>x1)
        {
        	int tt=0;
        	while(tt<t)
        	{
        		x1=x1+v1;
        		x2=x2+v2;
        		if(x1==x2)
        		{
        			System.out.println("YES");
        			return;
        		}
        		tt++;
        	}
        	if(x1==x2)
    		{
    			System.out.println("YES");
    			return;
    		}
        	else
        	{
        		System.out.println("NO");
    			return;
        	}
        }*/
        System.out.println("NO");
        
	}

}
