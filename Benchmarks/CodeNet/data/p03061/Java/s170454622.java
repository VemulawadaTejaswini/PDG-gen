

import java.util.Scanner;

public class Main {
	 public static long gcd(long a,long b) 
	    { 
	        if (a == 0) 
	            return b; 
	          
	        return gcd(b%a, a); 
	    } 
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n+2];
		long gcd[]=new long[n+2];
//		int first=ar[0]
		gcd[n+1]=1;
		for(int i=1;i<=n;i++)
		{
			ar[i]=scan.nextInt();
		}
		ar[0]=1;
		long first=ar[1];
		gcd[1]=first;
		long right[]=new long[n+2];
		for(int i=2;i<=n;i++)
		{
			first=gcd(first,ar[i]);
			gcd[i]=first;
		}
		right[n]=ar[n];
		first=ar[n];
		right[n+1]=0;
		for(int i=n;i>=1;i--)
		{
			first=gcd(first,ar[i]);
			right[i]=first;
		}
//		for(long x:gcd)
//		{
//			System.out.print(x+" ");
//		}
//		System.out.println();
//		for(long y:right)
//		{
//			System.out.print(y+" ");
//		}
	
		long ans=0;
		for(int i=1;i<=n;i++)
			
		{
			long anss=gcd(right[i+1],gcd[i-1]);
//			System.out.println(anss);
			ans=Math.max(anss, ans);
		}
		System.out.println(ans);
		
		//now skip every element 
	}
}
