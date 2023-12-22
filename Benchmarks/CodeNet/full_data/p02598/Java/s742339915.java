import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		long K = sc.nextInt();
		int ub = 0;
		for (int i = 0; i < N; i++) {
			ub = Math.max(ub, a[i] = sc.nextInt());
		}
		int lb = 0;
		while (ub - lb > 1) {
			int m = (ub + lb) / 2;
			long Q = 0;
			for (int i = 0; i < N; i++) {
				Q += (a[i] - 1) / m;
			}
			if (Q <= K) {
				ub = m;
			} else {
				lb = m;
			}
		}
		System.out.println(ub);
	}
}
