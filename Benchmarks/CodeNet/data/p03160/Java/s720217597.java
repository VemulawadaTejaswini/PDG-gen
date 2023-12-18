

public int minCost(int[] heights)
{
  int[] dp=new int[heights.length];
  dp[0]=0;dp[1]=Math.abs(heights[1]-heights[0]);
  for(int i=2;i<heights.length;i++)
  {
    dp[i]=Math.min(dp[i-1]+Math.abs(heights[i]-heights[i-1]),
                   dp[i-2]+Math.abs(heights[i]-heights[i-2]));
  }
  return dp[dp.length-1];
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int[] h=new int[size];
		for(int i=0;i<size;i++)
		{
			h[i]=(s.nextInt());
		}
		System.out.println(new Main().minCost(h));
		s.close();
	}