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
		int maxConcentration = 0;
		int water = 0;
		int sugar = 0;
		for (int i = 0; 100 * A * i <= F; i += 1) {
			int currentWater = 100 * A * i;
			for (int j = 0; currentWater + 100 * B * j <= F; j += 1) {
				currentWater += 100 * B * j;
				int maxSugar = Math.min(F - currentWater,
						currentWater / 100 * E);
				for (int k = 0; C * k <= maxSugar; k += 1) {
					int currentSugar = C * k;
					for (int l = 0; currentSugar + D * l <= maxSugar; l += 1) {
						currentSugar += D * l;
						if (currentWater + currentSugar == 0) {
							continue;
						}
						int concentration = (100 * currentSugar)
								/ (currentWater + currentSugar);
						if (maxConcentration >= concentration) {
							continue;
						}
						maxConcentration = concentration;
						water = currentWater;
						sugar = currentSugar;
					}
				}
			}
		}
		out.println("" + (water + sugar) + " " + sugar);
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
