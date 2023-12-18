import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int W = sc.nextInt();
		int H = sc.nextInt();
		int[] P = new int[W];
		int[] Q = new int[H];
		for (int i = 0; i < W; ++i) {
			P[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < H; ++i) {
			Q[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(P);
		Arrays.sort(Q);
		long ans = 0;
		int pi = W - 1;
		int qi = H - 1;
		while (pi >= 0 || qi >= 0) {
			boolean useP;
			if (pi < 0) {
				useP = false;
			} else if (qi < 0) {
				useP = true;
			} else {
				useP = P[pi] > Q[qi];
			}
			if (useP) {
				ans += (long) P[pi] * (H - qi);
				--pi;
			} else {
				ans += (long) Q[qi] * (W - pi);
				--qi;
			}
		}
		System.out.println(ans);
	}

}
