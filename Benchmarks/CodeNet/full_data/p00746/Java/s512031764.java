import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] x;
		int[] y;
		x = new int[200];
		y = new int[200];
		for (int i = 0; i < 200; i++) {
			x[i] = 0;
			y[i] = 0;
		}

		while (true) {
			String N = s.next();
			int n = Integer.parseInt(N);
			if (n == 0)
				break;

			for (int t = 1; t < n; t++) {
				String Num1 = s.next();
				String Num2 = s.next();
				int num1 = Integer.parseInt(Num1);
				int num2 = Integer.parseInt(Num2);

				switch (num2) {
				case 0:
					x[t] = x[num1] - 1;
					y[t] = y[num1];
					break;
				case 1:
					x[t] = x[num1];
					y[t] = y[num1] - 1;
					break;
				case 2:
					x[t] = x[num1] + 1;
					y[t] = y[num1];
					break;
				case 3:
					x[t] = x[num1];
					y[t] = y[num1] + 1;
					break;
				}
			}

			int width, height;
			int xmax = 0;
			int xmin = 0;
			int ymax = 0;
			int ymin = 0;

			for (int i = 0; i < n; i++) {
				xmax = Math.max(xmax, x[i]);
				xmin = Math.min(xmin, x[i]);
				ymax = Math.max(ymax, y[i]);
				ymin = Math.min(ymin, y[i]);
			}

			width = xmax - xmin + 1;
			height = ymax - ymin + 1;
			System.out.println(width+" "+height);
		}
	}
}