import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 & (m = in.nextInt()) != 0) {
			int counter = 0;
			int[] hs = new int[1500 * 1000];
			int[] array1 = new int[n];
			for (int i1 = 0; i1 < n; i1++) {
				int val1 = in.nextInt();
				int j1 = 0;
				int v1 = val1;
				do {
					hs[v1]++;
					v1 = val1 + array1[j1];
					array1[j1] = v1;
				} while (j1++ < i1);
			}
			int[] array = new int[m];
			for (int i = 0; i < m; i++) {
				int val = in.nextInt();
				int j = 0;
				int v = val;
				do {
					v = val + array[j];
					array[j] = v;
					counter += hs[v];
				} while (j++ < i);
			}
			System.out.println(counter);
		}

	}
}