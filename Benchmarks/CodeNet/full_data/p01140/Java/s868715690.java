import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] h = new int[n];
			int[] height = new int[100000];
			int[] w = new int[m];
			int[] width = new int[100000];
			int hmax = 0, wmax = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int hh = h[i];
				height[hh]++;
				for (int j = i - 1; j >= 0; j--) {
					hh += h[j];
					height[hh]++;
				}
				if (i == n - 1)
					hmax = hh;
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int ww = w[i];
				width[ww]++;
				for (int j = i - 1; j >= 0; j--) {
					ww += w[j];
					width[ww]++;
				}
				if (i == m - 1)
					wmax = ww;
			}
			int result = 0;
			for (int i = 0; i <= Math.min(hmax, wmax); i++)
				result += height[i] * width[i];
			System.out.println(result);
		}
		sc.close();
	}
}