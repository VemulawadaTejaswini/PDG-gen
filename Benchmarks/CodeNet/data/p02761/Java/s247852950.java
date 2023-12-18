import java.util.Scanner;

public class Main {

	public static int N;
	public static int M;
	public static int[] S;
	public static int[] C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		S = new int[M];
		C = new int[M];
		for (int i = 0; i < M; i++) {
			S[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		System.out.println(solve());
	}

	public static boolean ok(String x) {
		if (x.length() != N) {
			return false;
		}
		for (int i = 0; i < M; i++) {
			if (x.charAt(S[i]) != (char)C[i]) {
				return false;
			}
		}
		return true;
	}

	public static String solve() {
		for (int i = 0; i < 1000; i++) {
			String x = String.valueOf(i);
			if (ok(x)) {
				return x;
			}
		}
		return "-1";
	}

}