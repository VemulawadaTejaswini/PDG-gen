
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(reader.readLine());
		}
		shellSort(a, n);
		for (int i = 0; i < n; i++) {
			builder.append(a[i]).append("\n");
		}
		System.out.print(builder);

	}

	private static void shellSort(int[] a, int n) {
		int[] g = new int[15];
		int m = 0;
		for (int i = 0; i < n; i = i * 3 + 1) {
			for (int j = m; 0 < j; j--) {
				g[j] = g[j - 1];
			}
			g[0] = i;
			m++;
		}
		if (m == 0) {
			g[0] = 1;
			m = 1;
		}
		builder.append(m).append("\n");
		int cnt = 0;
		for (int i = 0; i < m; i++) {
			if (i != 0)
				builder.append(" ");
			builder.append(g[i]);
			cnt += insertionSort(a, n, g[i]);
		}
		builder.append("\n").append(cnt).append("\n");
	}

	private static int insertionSort(int[] a, int n, int g) {
		int cnt = 0;
		for (int i = g; i < n; i++) {
			int key = a[i];
			int j = i - g;
			while (j >= 0 && a[j] > key) {
				a[j + g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j + g] = key;
		}
		return cnt;
	}
}