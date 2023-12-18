import java.util.*;
//TOP BOTTOM 

public class Main {
	static int[] v, w;
	static int n, s; // Length el elements w hgm l shanta ele m3ak
	static int dp[][];

	public static int dp(int idx, int rem) {
		if (rem < 0) {
			return -(int) 1e9; // infinty value
		}
		if (idx == n) {
			return 0;
		}

		int take = v[idx] + dp(idx + 1, rem - w[idx]);
		int leave = dp(idx + 1, rem);
		return Math.max(take, leave); // Da keda mn gher dp da tkrar tbe3e gddn !

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		s = sc.nextInt();

		w = new int[n];
		v = new int[n];

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();

		}

		dp = new int[n][s + 1]; // tagnab l outof range
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}
		System.out.println(dp(0, s));

	}

}
