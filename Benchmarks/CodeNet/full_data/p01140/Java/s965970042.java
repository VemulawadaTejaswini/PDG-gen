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
			int result = 0;
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					int a = i + 1;
					int b = j + 1;
					int height = h[i];
					int width = w[j];
					while (true) {
						if (height == width) {
							result++;
							if (a == n || b == n)
								break;
							if (h[a] < w[b]) {
								height += h[a];
								a++;
								continue;
							}
							width += w[b];
							b++;
							continue;
						}
						if (height < width) {
							if (a == n)
								break;
							height += h[a];
							a++;
							continue;
						}
						if (b == n)
							break;
						width += w[b];
						b++;
					}
				}
			System.out.println(result);
		}
		sc.close();
	}
}