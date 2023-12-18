import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	String repeat(String s, int n) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < n; i++) {
			result.append(s);
		}
		return result.toString();
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		sc.close();

		StringBuffer ans = new StringBuffer();

		// (sx+1, sy) -> (tx, ty-1)
		ans.append("R");
		ans.append(repeat("R", tx - (sx + 1)));
		ans.append(repeat("U", (ty - 1) - sy));
		ans.append("U");

		// (tx-1, ty) -> (sx, sy+1)
		ans.append("L");
		ans.append(repeat("L", (tx - 1) - sx));
		ans.append(repeat("D", ty - (sy + 1)));
		ans.append("D");

		// (sx, sy-1) -> (tx+1, ty)
		ans.append("D");
		ans.append(repeat("R", (tx + 1) - sx));
		ans.append(repeat("U", ty - (sy - 1)));
		ans.append("L");

		// (tx, ty+1) -> (sx-1, sy)
		ans.append("U");
		ans.append(repeat("L", tx - (sx - 1)));
		ans.append(repeat("D", (ty + 1) - sy));
		ans.append("R");

		out.println(ans.toString());
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
