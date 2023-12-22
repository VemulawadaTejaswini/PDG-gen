import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int time = 0;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();

		int[][] v = new int[n + 1][n];
		int[] d = new int[n + 1];
		int[] f = new int[n + 1];

		for (int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			for (int j = 0; j < k; j++)
				v[u][j] = scan.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			if (d[i] == 0)
				Dsearch(v, d, f, i);
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + d[i] + " " + f[i]);
		}

		scan.close();
		System.exit(0);
	}

	private static void Dsearch(int[][] v, int[] d, int[] f, int u) {
		d[u] = ++time;
		for (int i = 0; i < v[u].length && v[u][i] > 0; i++)
			if (d[v[u][i]] == 0)
				Dsearch(v, d, f, v[u][i]);
		f[u] = ++time;
	}
}