import java.util.Scanner;

public class Main {
	private static final int K = 26;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var d = sc.nextInt();
		var c = new int[K];
		var s = new int[d][K];
		for (var i = 0; i < K; i++) {
			c[i] = sc.nextInt();
		}
		for (var i = 0; i < d; i++) {
			for (var j = 0; j < K; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		var t = new int[d];
		for (var i = 0; i < d; i++) {
			t[i] = sc.nextInt();
		}
		var m = sc.nextInt();
		var md = new int[m];
		var mq = new int[m];
		for (var i = 0; i < m; i++) {
			md[i] = sc.nextInt();
			mq[i] = sc.nextInt();
		}
		sc.close();

		for (var i = 0; i < m; i++) {
			var t2 = new int[d];
			System.arraycopy(t, 0, t2, 0, d);
			t2[md[i] - 1] = mq[i];
			System.arraycopy(t2, 0, t, 0, d);
			var sum = score(c, s, t2, d);
			System.out.println(sum);
		}
	}

	private static int score(int[] c, int[][] s, int[] t, int d) {
		var sum = 0;
		var last = new int[K];
		for (var i = 0; i < d; i++) {
			var ti = t[i] - 1;
			sum += s[i][ti];
			last[ti] = i + 1;
			for (var j = 0; j < K; j++) {
				sum -= ((i + 1) - last[j]) * c[j];
			}
		}

		return sum;
	}
}
