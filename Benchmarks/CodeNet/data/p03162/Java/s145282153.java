import java.util.*;

class Main{
	static int []segmentTree;

	static void build(int []nums) {
		int n = nums.length;
		for (int i=0; i<n; i++)
			segmentTree[n+i] = nums[i];
		for (int i=n-1; i>0; i--) {
			segmentTree[i] = segmentTree[2*i] + segmentTree[2*i+1];
		}
	}

	static int query(int l, int r, int n) {
		int sum = 0;
		for (l+=n, r+=n; l<r; l>>=1, r>>=1) {
			if ((l&1) == 1) {
				sum += segmentTree[l++];
			}
			if ((r&1) == 1) {
				sum += segmentTree[--r];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int [][]nums = new int[n][3];
		for (int i=0; i<n; i++)
			for (int j=0; j<3; j++)
				nums[i][j] = in.nextInt();
		int [][]dp = new int[n+1][3];
		dp[0][0] = nums[0][0];
		dp[0][1] = nums[0][1];
		dp[0][2] = nums[0][2];
		for (int i=1; i<n; i++) {
			dp[i][0] = nums[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = nums[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = nums[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
		}
		// for (int i=0; i<n; i++) {
		// 	for (int j=0; j<3; j++)
		// 		System.out.println(dp[i][j]+" ");
		// 	System.out.println();
		// }
		System.out.println(Math.max(dp[n-1][1], Math.max(dp[n-1][0], dp[n-1][2])));
	}
}