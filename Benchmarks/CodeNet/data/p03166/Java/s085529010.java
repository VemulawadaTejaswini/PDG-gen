

import java.util.Scanner;
import java.util.Vector;

public class Main {
	static Vector<Integer> [] link;
	static int dp[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		link = new Vector[n+1];
		for (int i=1;i<=n;i++)
			link[i] = new Vector();
		dp = new int[n+1];
		
		for (int i=0;i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			link[a].add(b);
		}
		int ans = 0;
		for (int i=1;i<=n;i++) {
			int l = f(i);
			if (ans<l) ans = l;
		}
		System.out.println(ans);
		
	}
	private static int f(int i) {
		if (dp[i]>0) return dp[i];
		int ans = 0;
		for (int j : link[i]) {
			int l = f(j) + 1;
			if (ans<l) ans = l;
		}
		dp[i] = ans;
		return ans;
	}
}
