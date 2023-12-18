import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int t = Integer.parseInt(sa[1]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < arr.length; i++) {
			Obj o = new Obj();
			sa = br.readLine().split(" ");
			o.i = i;
			o.a = Integer.parseInt(sa[0]);
			o.b = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o1.a - o2.a);
		int[][] dp = new int[n + 1][t];
		for (int i = 0; i < n; i++) {
			int a = arr[i].a;
			int b = arr[i].b;
			for (int j = 0; j < t; j++) {
				if (j >= a && dp[i][j] < dp[i][j - a] + b) {
					dp[i + 1][j] = dp[i][j - a] + b;
				} else {
					dp[i + 1][j] = dp[i][j];
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int val = dp[i][t - 1];
			int bmax = 0;
			for (int j = i; j < n; j++) {
				bmax = Math.max(bmax, arr[j].b);
			}
			val += bmax;
			ans = Math.max(ans, val);
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a, b;
	}
}
