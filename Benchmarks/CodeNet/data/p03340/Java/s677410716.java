import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Solve s = new Solve();
		s.solve();
	}

}

class Solve {

	// 標準入力用
	Scanner sc;

	public Solve() {
		sc = new Scanner(System.in);
	}

	public void solve() {
		int N = sc.nextInt();
		int[] A = new int[N];
		int counter = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int l = 0, r = 0; l <=r ; l++) {
			for (r = l; r < N; r++) {
				if (add(l, r, A) == xor(l, r, A)) {
//					System.out.println(add(l, r, A) +" : " + xor(l, r, A) + " l, r " + l + " " + r);
					counter++;
				} else if (add(l, r, A) == xor(l, r, A)) {
					break;
				}
			}
		}

		// 出力。
		System.out.println(counter);

	}

	public int add (int left, int right, int[] t) {
		int result = 0;
		for (int i = left; i < right + 1; i++) {
			result += t[i];
		}
		return result;
	}

	// xorは結合法則が成り立つ。
	public int xor(int left, int right, int[] t) {
		int result = 0;
		for (int i = left; i < right + 1; i++) {
			result ^= t[i];
		}
		return result;
	}
}