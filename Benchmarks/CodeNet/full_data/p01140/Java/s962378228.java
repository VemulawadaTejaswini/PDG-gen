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
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					int height = 0;
					for (int k = i; k < n; k++) {
						int width = 0;
						height += h[k];
						for (int l = j; l < m; l++) {
							width += w[l];
							if (height == width)
								result++;
							if (height < width)
								break;
						}
					}
				}
			System.out.println(result);
		}
		sc.close();
	}
}