import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	HashMap<Integer[], Integer> memo = new HashMap<>();

	int rec(int p, int m) { //%10がmでないように、p以降を足した場合の、最大値を返す
		return memo.computeIfAbsent(new Integer[] { p, m }, z -> {
			int pp = z[0];
			int mm = z[1];
			if (pp == N) {
				return 0;
			}

			int a1 = s[pp] + rec(pp + 1, (10 - (mm + s[pp] % 10) % 10));
			if (a1 % 10 == m)
				a1 = 0;
			int a2 = rec(pp + 1, mm);
			if (a2 % 10 == mm)
				a2 = 0;

			int result = Math.max(a1, a2);
			return result;
		});
	}

	//	int rec(int p, int m) { //%10がmでないように、p以降を足した場合の、最大値を返す
	//		if(p==N) {
	//			return 0;
	//		}
	//
	//		int a1 = s[p] + rec(p+1, (10-(m+s[p]%10)%10));
	//		if(a1%10==m) a1=0;
	//		int a2 = rec(p+1,m);
	//		if(a2%10==m) a2=0;
	//
	//		int result = Math.max(a1, a2);
	//		return result;
	//	}

	int N;
	int[] s;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		s = nextIntArray(sc, N);

		sc.close();

		out.println(rec(0, 0));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
