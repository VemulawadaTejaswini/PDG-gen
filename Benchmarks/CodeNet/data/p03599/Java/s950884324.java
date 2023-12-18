import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		int F = in.nextInt();
		double maxConcentration = -1;
		int water = 0;
		int sugar = 0;
		for (int i = 0; 100 * A * i <= F; i += 1) {
			int a = 100 * A * i;
			for (int j = 0; a + 100 * B * j <= F; j += 1) {
				int b = 100 * B * j;
				int maxSugar = Math.min(F - a - b, (a + b) / 100 * E);
				for (int k = 0; C * k <= maxSugar; k += 1) {
					int c = C * k;
					for (int l = 0; c + D * l <= maxSugar; l += 1) {
						int d = D * l;
						if (a + b + c + d == 0) {
							continue;
						}
						double concentration = (double) (c + d)
								/ (a + b + c + d);
						if (maxConcentration >= concentration) {
							continue;
						}
						maxConcentration = concentration;
						water = a + b;
						sugar = c + d;
					}
				}
			}
		}
		out.println((water + sugar) + " " + sugar);
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
