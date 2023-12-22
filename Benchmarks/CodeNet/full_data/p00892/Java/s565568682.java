import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
	static int m, n;
	static double[][] pm, pn;
	static ArrayList<Double> lis;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			m = sc.nextInt();
			n = sc.nextInt();
			if (m == 0 && n == 0)
				break;
			pm = new double[m][2];
			pn = new double[n][2];
			lis = new ArrayList<>();
			for (int i = 0; i < m; ++i) {
				pm[i][0] = sc.nextDouble();
				pm[i][1] = sc.nextDouble();
				lis.add(pm[i][0]);
			}
			for (int i = 0; i < n; ++i) {
				pn[i][0] = sc.nextDouble();
				pn[i][1] = sc.nextDouble();
				lis.add(pn[i][0]);
			}
			Collections.sort(lis);
			for (int i = 0; i < lis.size(); ++i) {
				while (i + 1 < lis.size() && Math.abs(lis.get(i) - lis.get(i + 1)) < 1e-6) {
					lis.remove(i + 1);
				}
			}

			double area = 0;
			for (int i = 0; i + 1 < lis.size(); ++i) {
				double srcX = lis.get(i);
				double dstX = lis.get(i + 1);
				double srcArea = width(srcX, pn) * width(srcX, pm);
				double middleArea = width((srcX + dstX) / 2, pn) * width((srcX + dstX) / 2, pm);
				double dstArea = width(dstX, pn) * width(dstX, pm);
				if (Math.abs(middleArea) < 1e-6)
					continue;
				area += (dstX - srcX) / 6 * (srcArea + dstArea + 4 * middleArea);
			}
			System.out.println(area);
		}
	}

	static double width(double x, double[][] arr) {
		int len = arr.length;
		double lb = Double.MAX_VALUE / 10;
		double ub = -Double.MAX_VALUE / 10;
		for (int i = 0; i < len; ++i) {
			double x1 = arr[i][0];
			double x2 = arr[(i + 1) % len][0];
			double y1 = arr[i][1];
			double y2 = arr[(i + 1) % len][1];
			if (Math.abs(x1 - x2) < 1e-6)
				continue;
			if ((x - x1) * (x - x2) <= 0) {
				double b = (Math.abs(x - x1) * y2 + Math.abs(x - x2) * y1) / (Math.abs(x - x1) + Math.abs(x - x2));
				lb = Math.min(lb, b);
				ub = Math.max(ub, b);
			}
		}
		return Math.max(0, ub - lb);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}