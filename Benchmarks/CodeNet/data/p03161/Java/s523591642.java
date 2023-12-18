import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int k=s.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int[] dp=new int[n];
		
		for(int i=1;i<n;i++)
		{
			int min=Integer.MAX_VALUE;
			
			for(int j=i-1;j>=Math.max(0,i-k);j--)
			{
				if(dp[j]+Math.abs(arr[j]-arr[i])<min)
					min=dp[j]+Math.abs(arr[j]-arr[i]);
			}
			
			dp[i]=min;
		}
		
		System.out.println(dp[n-1]);
		
	}
	
}