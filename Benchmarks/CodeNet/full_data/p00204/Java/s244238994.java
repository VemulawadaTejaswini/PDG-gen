import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r, n;
		while ((r = s.nextInt()) != 0 && (n = s.nextInt()) != 0) {
			double[][] ufo = new double[n][6];  // x, y, r, v(, dis, fin_step)
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 4; j++)
					ufo[i][j] = s.nextInt();
				ufo[i][4] = Math.hypot(ufo[i][0], ufo[i][1]); // £
				ufo[i][5] = Math.floor((Math.abs(ufo[i][4]) - r) / ufo[i][3]); // NüÔ
			}

			int[] st = new int[n];
			for (int i = 0; i < n; i++)
				st[i] = 0;
			
			for (int i = 0; i < n; i++) { // step				
				 // Åàß¢UFOðTµA¯ÉNüµ½UFOÉ}[N
				int near = -1;
				for (int j = 0; j < n; j++) {
					if (st[j] != 0) continue; // ùÉNüorÄ
					if (ufo[j][5] < i) st[j] = 1;  // Nüµ½
					else if (near == -1 || ufo[near][4] > ufo[j][4])
						near = j; // Åàß¢UFO
				}
				if (near == -1) break;
				double x0 = ufo[near][0]; // Åàß¢UFO
				double y0 = ufo[near][1];

				// UFOðÄ
				for (int j = 0; j < n; j++) {
					if (st[j] != 0) continue; // ùÉNü©ÄóÔÈçX[
					double x1 = ufo[j][0];
					double y1 = ufo[j][1];
					
					if (y0 == 0) {
						if ((x0 >= 0 && x1 >= 0) || (x0 < 0 && x1 < 0)) // ¯¶ü«
							if (Math.abs(y1) <= r) st[j] = 2; // Ä
					} else if (x0 == 0) {
						if ((y0 >= 0 && y1 >= 0) || (y0 < 0 && y1 < 0)) // ¯¶ü«
							if (Math.abs(x1) <= r) st[j] = 2; // Ä
					} else {
						double a = y0 / x0; // X«
						if ((x0 >= 0 && x1 >= 0) || (x0 < 0 && x1 < 0)) // ¯¶ü«
							if ((y0 >= 0 && y1 >= 0) || (y0 < 0 && y1 < 0))
								if (Math.abs(y1 - a * x1) <= r) st[j] = 2; // Ä
					}
				}
			}
			
			int sum = 0;
			for (int j = 0; j < n; j++)
				if (st[j] == 1) sum++;
			System.out.println(sum);
		}
	}
}