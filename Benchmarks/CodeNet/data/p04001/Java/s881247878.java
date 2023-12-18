import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[] S;

	public static void main(String[] args) {
		S = sc.next().toCharArray();
		System.out.println(solve(0, S.length));
	}

	static long solve(int l, int r) {
		if (l == r) return 0;
		long ret = Long.parseLong(String.valueOf(S, l, r - l));
		for (int i = 1; l + i < r; ++i) {
			long base = Long.parseLong(String.valueOf(S, l, i));
			ret += base * (1 << (r - l - 1 - i)) + solve(l + i, r);
		}
		return ret;
	}

}
