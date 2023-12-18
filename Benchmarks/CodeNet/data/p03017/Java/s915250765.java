import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int A = sc.nextInt() - 1;
		int B = sc.nextInt() - 1;
		int C = sc.nextInt() - 1;
		int D = sc.nextInt() - 1;
		String S = sc.next();
		sc.close();

		int[] s = new int[N];
		for (int i = 0; i < N; i++) {
			s[i] = S.charAt(i) == '#' ? 1 : 0;
		}

		String ans = "Yes";

		if (C < D) {
			// ふぬけ、すぬけの順に処理すれば位置の入れ替えは発生しない
			// [A,C] , [B,D]に連続した#がなければok
			for (int i = A + 1; i <= C; i++) {
				if (s[i - 1] == 1 && s[i] == 1) {
					ans = "No";
				}
			}

			for (int i = B + 1; i <= D; i++) {
				if (s[i - 1] == 1 && s[i] == 1) {
					ans = "No";
				}
			}
		} else {

			// 位置の入れ替えを1回行わないといけない
			// [A,C], [B,D]に連続した#がなく、[B,D]に３つ連続した.が１つ以上存在すればok
			for (int i = A + 1; i <= C; i++) {
				if (s[i - 1] == 1 && s[i] == 1) {
					ans = "No";
				}
			}

			boolean irekable = false;
			for (int i = B + 1; i <= D; i++) {
				if (s[i - 1] == 1 && s[i] == 1) {
					ans = "No";
				}
				if ((i <= D - 1) && (s[i - 1] == 0 && s[i] == 0 && s[i + 1] == 0)) {
					irekable = true;
				}

			}
			if (!irekable) {
				ans = "No";
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
