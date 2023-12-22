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
			int[] w = new int[m];
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			int result = 0;
			int[] width = new int[15000001];
			int[] height = new int[width.length];
			for (int i = 0; i < width.length; i++) {
				width[i] = 0;
				height[i] = 0;
			}
			for (int i = 0; i < n; i++) {
				int wid = 0;
				for (int j = i; j < n; j++) {
					wid += w[j];
					width[wid]++;
				}
			}
			for (int i = 0; i < m; i++) {
				int hei = 0;
				for (int j = i; j < m; j++) {
					hei += w[j];
					height[hei]++;
				}
			}
			for (int i = 0; i < width.length; i++)
				result += width[i] * height[i];
			System.out.println(result);
		}
		sc.close();
	}
}