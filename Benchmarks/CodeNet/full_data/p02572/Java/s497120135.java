import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long m=1000000007;
		
		int n=s.nextInt();
		
		long[] arr=new long[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextLong();
		}
		
		long sum=0;
		for(int i=0;i<n;i++)
		{
		sum=(sum%m+arr[i]%m)%m;
		}
		
		sum=(sum%m*sum%m)%m;
		
		long g=0;
		
		for(int i=0;i<n;i++)
		{
			g=(g%m+(arr[i]%m*arr[i]%m)%m)%m;
		}
		
		long ans=((sum%m-g%m+m)%m*power(2,m-2,m)%m)%m;
		
		System.out.println(ans);
		
	}
	
	public static long power(long a,long b,long m)
	{
		long res=1;
		
		while(b>0)
		{
			if(b%2!=0)
			{
				res=(res%m*a%m)%m;
			}
			
			b=b/2;
			a=(a%m*a%m)%m;
		}
		
		return res;
	}
	
}