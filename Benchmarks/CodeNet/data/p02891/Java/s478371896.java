import java.util.BitSet;
import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		int K = sc.nextInt();

		String S2 = S + S;
		BitSet bits = new BitSet(S2.length());
		char[] chars = S2.toCharArray();
		for (int i = 1; i < chars.length; i++) {
			bits.set(i, !bits.get(i - 1) && chars[i - 1] == chars[i]);
		}
		long result = bits.cardinality() * (K / 2L);
		result += Math.min(bits.get(0, S.length()).cardinality(), bits.get(S.length(), S2.length()).cardinality()) * (K % 2L);
		System.out.println(result);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}