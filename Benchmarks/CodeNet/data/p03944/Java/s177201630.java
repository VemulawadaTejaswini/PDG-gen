
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] a = new int[N];

		int xmin = 0;
		int xmax = W;
		int ymin = 0;
		int ymax = H;
		for (int i = 0; i < N; ++i) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			a[i] = sc.nextInt();
			if (a[i] == 1) {
				xmin = Math.max(xmin, x[i]);
			} else if (a[i] == 2) {
				xmax = Math.min(xmax, x[i]);
			} else if (a[i] == 3) {
				ymin = Math.max(ymin, y[i]);
			} else if (a[i] == 4) {
				ymax = Math.min(ymax, y[i]);
			}
		}
		System.out.println(Math.max(0,(xmax - xmin) * (ymax - ymin)));
	}
}
