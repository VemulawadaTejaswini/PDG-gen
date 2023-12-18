public class Frog {

	//top down approach.
	public static int getMinCost(int n,int[] height){
		
		int result=0;
		//height[n]=0;height[n+1]=0;
		int[] dp=new int[n+2];
		result=getCost(0,height,dp,n);
		
		return result;
	}

	private static int getCost(int i, int[] height, int[] dp, int n) {

		if (i >= n - 1)
			return dp[i] = 0;

		if (dp[i] == 0) {
			dp[i] = Math.min(
					Math.abs(height[i] - height[i + 1])
							+ getCost(i + 1, height, dp, n),
					Math.abs(height[i] - height[i + 2])
							+ getCost(i + 2, height, dp, n));
		}

		return dp[i];
	}
	
	
	/*public static void main(String[] args) {
		int n=6;
		int[] arr={30,10,60,10,60,50};
		int[] arrTpDn={30,10,60,10,60,50,0};
		System.out.println(getMinCostBtUp(n, arr));
	}
	
	//bottom up approach
	
	public static int getMinCostBtUp(int n, int[] height) {

		int[] dp = new int[n];
		dp[0] = 0;
		dp[1] = Math.abs(height[1] - height[0]);
		for (int i = 2; i < height.length; i++) {
			dp[i] = Math.min(dp[i - 1] + Math.abs(height[i] - height[i - 1]),
					dp[i - 2] + Math.abs(height[i] - height[i - 2]));

		}

		return dp[n - 1];
	}*/


	
}