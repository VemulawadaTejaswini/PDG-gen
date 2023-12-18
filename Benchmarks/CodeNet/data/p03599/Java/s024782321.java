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

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();

		sc.close();

		List<Integer> x = new ArrayList<>(); // F以下の、あり得る水の量
		for (int ai = 0; ai * A * 100 <= F; ai++) {
			for (int bi = 0; ai * A * 100 + bi * B * 100 <= F; bi++) {
				x.add(ai * A * 100 + bi * B * 100);
			}
		}

		List<Integer> y = new ArrayList<>(); // F以下の、あり得る砂糖の量
		for (int ci = 0; ci * C <= F; ci++) {
			for (int di = 0; ci * C + di * D <= F; di++) {
				y.add(ci * C + di * D);
			}
		}

		double con = Double.NEGATIVE_INFINITY;
		int ans1 = 0;
		int ans2 = 0;

		for (int w : x) {
			for (int s : y) {
				if (w + s > F) {
					continue;
				}
				if (s * 100 <= E * w) { //溶けきるか
					double con2 = (double) s / (s + w);
					if (con < con2) {
						con = con2;
						ans1 = w + s;
						ans2 = s;
					}
				}
			}
		}

		out.println(ans1 + " " + ans2);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
