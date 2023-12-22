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
			int[] x = new int[1500000];
			int[] w = new int[m];
			int[] y = new int[1500000];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int nh = 0;
				for (int j = i; j >= 0; j--) {
					nh += h[j];
					y[nh]++;
				}
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int nw = 0;
				for (int j = i; j >= 0; j--) {
					nw += w[j];
					x[nw]++;
				}
			}
			int result = 0;
			for (int i = 0; i < x.length; i++)
				result += x[i] * y[i];
			System.out.println(result);
		}
		sc.close();
	}
}