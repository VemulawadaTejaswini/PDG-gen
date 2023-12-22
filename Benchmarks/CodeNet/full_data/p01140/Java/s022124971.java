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
			int[] y = new int[(n + n * n) / 2];
			int pointer = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int nh = 0;
				for (int j = i; j >= 0; j--) {
					nh += h[j];
					y[pointer] = nh;
					pointer++;
				}
			}
			Arrays.sort(y);
			int result = 0;
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int nw = 0;
				pointer = 0;
				for (int j = i; j >= 0; j--) {
					nw += w[j];
					for (int k = pointer; k < y.length; k++) {
						if (y[k] == nw)
							result++;
						if (y[k] > nw) {
							pointer = k - 1;
							break;
						}
					}
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

	static boolean contains(int[] y, int nw) {
		for (int i = 0; i < y.length; i++)
			if (y[i] == nw)
				return true;
		return false;
	}
}