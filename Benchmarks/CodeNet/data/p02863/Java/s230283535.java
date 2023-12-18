import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

		Arrays.parallelSort(arr, (o1, o2) -> o2.b - o1.b);
		int[] dp = new int[t];
		int[] dp2 = new int[t];
		Arrays.fill(dp2, -1);
		for (int i = 0; i < n; i++) {
			int a = arr[i].a;
			int b = arr[i].b;
			for (int j = t - 1; j >= 0; j--) {
				if (j >= a) {
					if (dp[j] <= dp[j - a] + b) {
						dp[j] = dp[j - a] + b;
						dp2[j] = i;
					}
				}
			}
		}

		int w = t - 1;
		Set<Integer> set = new HashSet<>();
		while (w > 0) {
			if (dp2[w] == -1) {
				break;
			} else {
				set.add(dp2[w]);
				Obj next = arr[dp2[w]];
				w -= next.a;
			}
		}

		int ans = dp[t - 1];
		for (int j = 0; j < arr.length; j++) {
			Obj o = arr[j];
			if (!set.contains(j)) {
				ans += o.b;
				break;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a, b;
	}
}
