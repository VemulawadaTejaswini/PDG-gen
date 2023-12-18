import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] sum = new long[N+1];
		int max = 0;
		sum[0] = 0;
		Map<Long, Integer> count = new HashMap<>();
		count.put(0L, 1);
		for(int i=1; i<=N; i++) {
			sum[i] = sum[i-1] + sc.nextLong();

			if(count.containsKey(sum[i])) {
				int new_c = count.get(sum[i])+1;
				count.put(sum[i], new_c);
				max = Math.max(max, new_c);
			}
			else {
				count.put(sum[i], 1);
				max = Math.max(max, 1);
			}
		}

		long ans = 0;
		ComInit(max);
		for(int value : count.values()) {
			ans += Com(value, 2);
		}

		System.out.println(ans);
	}

	//ただのnCrを1回求めるとき
	public static long[] fac;

	//nCr計算の前処理(nCrを計算するとき必ず前に入れる)
	public static void ComInit(int n) {
		fac = new long[n+1];

		fac[0] = 1;
		fac[1] = 1;;

		if(n > 1) {
			for(int i=2; i<=n; i++) {
				fac[i] = fac[i - 1] * i;
			}
		}
	}

	//nCr計算(r,n <= 10^7)
	public static long Com(int n, int r) {
		if(n < r)
			return 0;

		if(n < 0 || r < 0)
			return 0;

		return fac[n] / (fac[n-r] * fac[r]);
	}
}
