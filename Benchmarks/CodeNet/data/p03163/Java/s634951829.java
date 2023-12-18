import java.util.Scanner;

public class Main {
	public long knapsack(int[] weights,int[] values,int W)
	{
		long[][] dp=new long[W+1][weights.length+1];
		
		for(int w=1;w<=W;w++)
		{
			for(int item=0;item<weights.length;item++)
			{
				dp[w][item+1]=dp[w][item];
				if(weights[item]>w)
					continue;
				dp[w][item+1]=
						Math.max(dp[w][item+1], 
						values[item]+dp[w-weights[item]][item]);
			}
		}
		
		return dp[W][weights.length];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int W=Integer.parseInt(s.next());
		int[] weights=new int[size];
		int[] values=new int[size];
		
		for(int i=0;i<size;i++)
		{
			weights[i]=s.nextInt();
			values[i]=s.nextInt();
		}
		System.out.println(new Main().knapsack(weights, values, W));
		s.close();
	}
}
