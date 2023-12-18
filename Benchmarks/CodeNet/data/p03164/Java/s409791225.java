import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static void printArrayL(long[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static<T> void printArrayT(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	public static String joinInt(int[] a, String separator) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				sb.append(separator);
			}
			sb.append(a[i]);
		}
		return sb.toString();		
	}

	static int[] nextIntArray(Scanner sc, int N) {
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] w = new int[N];
		int[] v = new int[N];
		int sumv = 0;
		for (int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			sumv += v[i];
		}
		// 価値N以上で最小の重さ
		long[] dp = new long[sumv + 1];
		Arrays.fill(dp, Long.MAX_VALUE);
		dp[0] = 0;

		// 重さ3で価値30が初期データなら
		// 1〜30まで重さ3で達成可能。それ以上は無理
		// 次に重さ4で価値50が来たら、
		// 1〜30までは重さ3に勝てないので、そのまま
		// 31〜50までは重さ4で上書き、51〜80までは、その合計でいける

		sumv = 0;
		for (int i = 0; i < N; i++) {
			int wi = w[i];
			int vi = v[i];
			for (int j = sumv + vi; j > sumv; j--) {
				if (j - vi < 0) break;
				dp[j] = dp[j - vi] + wi;
			}
			for (int j = sumv; j > vi; j--) {
				dp[j] = Math.min(dp[j], dp[j - vi] + wi);
			}
			for (int j = vi; j > 0; j--) {
				dp[j] = Math.min(dp[j], wi);
			}
			sumv += vi;
		}
		int ans = 0;
		for (int i = dp.length - 1; i >= 0; i--) {
			if (dp[i] <= W) {
				ans = i;
				break;
			}
		}
		// printArrayL(dp);
		System.out.println(ans);
	}
}
