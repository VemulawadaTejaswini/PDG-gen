import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<TreeSet<Key>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new TreeSet<>());
		}
		Key[] arr = new Key[m];
		for (int i = 0; i < arr.length; i++) {
			Key k = new Key();
			sa = br.readLine().split(" ");
			k.a = Integer.parseInt(sa[0]);
			k.b = Integer.parseInt(sa[1]);
			sa = br.readLine().split(" ");
			for (int j = 0; j < sa.length; j++) {
				int o = Integer.parseInt(sa[j]) - 1;
				o = 1 << o;
				k.c |= o;
			}
			arr[i] = k;
		}
		br.close();

		int n2 = 1 << n;
		int[] dp = new int[n2];
		Arrays.fill(dp, 100000000);
		dp[0] = 0;
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < m; j++) {
				int k = arr[j].c | i;
				dp[k] = Math.min(dp[k], dp[i] + arr[j].a);
			}
		}
		if (dp[n2 - 1] == 100000000) {
			System.out.println(-1);
		} else {
			System.out.println(dp[n2 - 1]);
		}
	}

	static class Key {
		int a, b, c;
	}
}
