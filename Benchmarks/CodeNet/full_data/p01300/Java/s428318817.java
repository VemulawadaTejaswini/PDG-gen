import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();

	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char[] c = sc.next().toCharArray();
			int n = c.length;
			if (n == 1 && c[0] == '0')
				return;
			int[] sum = new int[n + 1];
			int[] cnt = new int[11];
			sum[0] = 0;
			cnt[0]++;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					sum[i + 1] = sum[i] - (c[i] - '0');
					sum[i + 1] = (sum[i + 1] + 11) % 11;
				} else {
					sum[i + 1] = sum[i] + (c[i] - '0');
					sum[i + 1] = (sum[i + 1] + 11) % 11;
				}
				cnt[sum[i + 1]]++;
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				cnt[sum[i]]--;
				if (c[i] - '0' != 0) {
					ans += cnt[sum[i]];
				}
			}
			System.out.println(ans);
		}
	}
	static void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}