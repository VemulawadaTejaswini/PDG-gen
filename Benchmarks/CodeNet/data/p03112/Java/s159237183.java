import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long[] s = new long[A + 2];
		long[] t = new long[B + 2];
		long[] x = new long[Q];
		for(int i = 1; i <= A; i++) {
			s[i] = sc.nextLong();
		}
		for(int i = 1; i <= B; i++) {
			t[i] = sc.nextLong();
		}
		for(int i = 0; i < Q; i++) {
			x[i] = sc.nextLong();
		}
		sc.close();
		long INF = (long)(Math.pow(10, 11));
		s[0] = t[0] = -INF;
		s[A + 1] = t[B + 1] = INF;
		for(int i = 0; i < Q; i++) {
			int a = bs(s, x[i]);
			int b = bs(t, x[i]);
			long m0 = Math.min(s[a - 1], t[b - 1]);
			long m1 = Math.max(s[a], t[b]);
			long l = Long.MAX_VALUE;
			l = Math.min(l, 2 * (x[i] - s[a - 1]) + t[b] - x[i]);
			l = Math.min(l, 2 * (s[a] - x[i]) + x[i] - t[b - 1]);
			l = Math.min(l, 2 * (x[i] - t[b - 1]) + s[a] - x[i]);
			l = Math.min(l, 2 * (t[b] - x[i]) + x[i] - s[a - 1]);
			l = Math.min(l, x[i] - m0);
			l = Math.min(l, m1 - x[i]);
			System.out.println(l);
		}

	}
	static int bs(long[] a, long k) {
		int l = -1;
		int r = a.length;
		while(r - l > 1) {
			int mid = (r + l) / 2;
			if(a[mid] >= k) {
				r = mid;
			}else {
				l = mid;
			}
		}
		return r;
	}
}