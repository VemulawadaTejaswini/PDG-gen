import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int[] dp=new int[n];
		
		for(int i=1;i<n;i++)
		{
			int one=Integer.MAX_VALUE;
			int two=Integer.MAX_VALUE;
			
			if(i-1>=0)
			{
				one=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
			}
			if(i-2>=0)
			{
				two=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
			}
			
			dp[i]=Math.min(one,two);
		}
		
		System.out.println(dp[n-1]);
		
	}
	
}