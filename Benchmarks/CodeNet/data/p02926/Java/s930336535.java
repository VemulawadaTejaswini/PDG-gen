import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[][] xy = new int[n][2];
		long sumX = 0;
		long sumY = 0;

		for (int i = 0; i < n; i++) {
			xy[i][0] = Integer.parseInt(sc.next());
			xy[i][1] = Integer.parseInt(sc.next());
			sumX += xy[i][0];
			sumY += xy[i][1];
		}

		long ansX = 0;
		long ansY = 0;
		if (sumX >= 0) {
			if (sumY >= 0) {
				for (int i = 0; i < n; i++) {
					if ((xy[i][0] >= 0 && xy[i][1] >= 0)
							|| (xy[i][0] <= 0 && xy[i][1] >= 0 && Math.abs(xy[i][0]) < Math.abs(xy[i][1]))
							|| (xy[i][0] >= 0 && xy[i][1] <= 0 && Math.abs(xy[i][0]) > Math.abs(xy[i][1]))) {
						ansX += xy[i][0];
						ansY += xy[i][1];
					}
				}
			} else {
				for (int i = 0; i < n; i++) {
					if ((xy[i][0] >= 0 && xy[i][1] <= 0)
							|| (xy[i][0] <= 0 && xy[i][1] <= 0 && Math.abs(xy[i][0]) < Math.abs(xy[i][1]))
							|| (xy[i][0] >= 0 && xy[i][1] >= 0 && Math.abs(xy[i][0]) > Math.abs(xy[i][1]))) {
						ansX += xy[i][0];
						ansY += xy[i][1];
					}
				}
			}
		} else {
			if (sumY >= 0) {
				for (int i = 0; i < n; i++) {
					if ((xy[i][0] <= 0 && xy[i][1] >= 0)
							|| (xy[i][0] >= 0 && xy[i][1] >= 0 && Math.abs(xy[i][0]) < Math.abs(xy[i][1]))
							|| (xy[i][0] <= 0 && xy[i][1] <= 0 && Math.abs(xy[i][0]) > Math.abs(xy[i][1]))) {
						ansX += xy[i][0];
						ansY += xy[i][1];
					}
				}
			} else {
				for (int i = 0; i < n; i++) {
					if ((xy[i][0] <= 0 && xy[i][1] <= 0)
							|| (xy[i][0] >= 0 && xy[i][1] <= 0 && Math.abs(xy[i][0]) < Math.abs(xy[i][1]))
							|| (xy[i][0] <= 0 && xy[i][1] >= 0 && Math.abs(xy[i][0]) > Math.abs(xy[i][1]))) {
						ansX += xy[i][0];
						ansY += xy[i][1];
					}
				}
			}
		}

		System.out.println(Math.sqrt(ansX * ansX + ansY * ansY));

		sc.close();
	}
}