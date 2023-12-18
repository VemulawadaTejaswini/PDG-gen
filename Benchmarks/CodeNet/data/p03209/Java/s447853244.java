import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	 static long ans=0; 
	static long [] a=new long[52];
	static long [] b=new long[52];
    static void dfs(long p,int n)
     {
    //System.out.println(p+" "+n);
    //System.out.println(a[n-1]+" "+b[n-1]);
    	if(n==1) 
    	{
    		if(p==2)
    		{
    			ans+=1;
    		}
    		else if(p==3)
    		{
    			ans+=2;
    		}
    		else if(p==4)
    		{
    			ans+=3;
    		}
    	}
    	else
    	{
    		if(p==a[n-1]+2)
    		{
    			ans=ans+1+b[n-1];
    			return ;
    		}
    		else if(p==a[n])
    		{
    			ans=ans+b[n];
    			return;
    		}
    		else if(p==1)
    		{
    			return;
    		}
    		else if(p>a[n-1]+2)
    		{
    			ans=ans+b[n-1]+1;
    			dfs(p-a[n-1]-2,n-1);
    		}
    		else 
    		{
    			dfs(p-1,n-1);
    		}
    	}
    	return ;
     }
	public static void main(String args[])throws IOException  {

		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		long m=in.nextLong();
         
		a[1]=5;
		b[1]=3;
		for(int i=2;i<=n;i++)
		{
			a[i]=2*a[i-1]+3;
			b[i]=2*b[i-1]+1;
		}
		dfs(m,n);
		System.out.println(ans);
//		while(in.hasNext())
//		{
//			
//			
//		}
//
//			
//		}
//		
	}
	
}
