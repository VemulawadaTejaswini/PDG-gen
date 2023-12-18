import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		// 文字->その文字が書いてあるマスのインデックス
		List<List<Integer>> c2idx = new ArrayList<>();
		for (int i = 0; i <= 26; i++) {
			c2idx.add(i, new ArrayList<Integer>());
		}

		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			c2idx.get(c - 'A').add(i + 1); // 0を左端はらはみ出たところとして使うので+1する
		}

		// 各マスのゴーレムの数。（[0]と[N+1]は端で消滅したもの）
		int[] g = new int[N + 2];
		for (int i = 0; i < g.length; i++) {
			g[i] = 1;
		}
		g[0] = 0;
		g[N + 1] = 0;

		for (int i = 0; i < Q; i++) {
			String t = sc.next();
			String d = sc.next();

			List<Integer> idx = c2idx.get(t.charAt(0) - 'A');
			if (d.equals("L")) {
				for (int p : idx) {
					g[p - 1] += g[p];
					g[p] = 0;
				}
			} else {
				for (int p : idx) {
					g[p + 1] += g[p];
					g[p] = 0;
				}
			}
		}

		out.println(N - g[0] - g[N + 1]);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
