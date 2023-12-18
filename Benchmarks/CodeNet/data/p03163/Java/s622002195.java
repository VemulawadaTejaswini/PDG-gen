public class Main{
	public static void main(String[] args) throws Exception{
		//BufferedInputStream bs = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		//Scanner sc = new Scanner(bs);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[][] items = new int[N+1][2];
		long[][] dp = new long[N+1][W+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < 2; j++) {
				items[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= W; j++) {
				if(j < items[i][0]) dp[i][j] = dp[i-1][j];
				else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-items[i][0]]+items[i][1]);
				}
			}
		}
		System.out.println(dp[N][W]);
	}
	public static void print(int[][] arr) {
		for(int[] a : arr)System.out.println(Arrays.toString(a));
	}
}
