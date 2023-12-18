import java.util.*;
class Main{
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int k=Integer.parseInt(s.next());
		int[] h=new int[size];
		for(int i=0;i<size;i++)
		{
			h[i]=(s.nextInt());
		}
		System.out.println(new Main().frog2(h,k));
		s.close();
	}
	public int frog2(int[] heights,int k)
	{
		int[] dp=new int[heights.length];
		
		for(int i=0;i<dp.length;i++)
			dp[i]=Integer.MAX_VALUE;
		dp[0]=0;
		for(int i=0;i<dp.length;i++)
		{
			for(int j=i+1;j<=i+k && j<dp.length;j++)
			{
				dp[j]=Math.min(dp[j], dp[i]+Math.abs(heights[j]-heights[i]));
						
			}
		}
		return dp[dp.length-1];
	}
}
