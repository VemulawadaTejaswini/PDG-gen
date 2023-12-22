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

		for (int i = 0; i < n; i++) {
			int u = scan.nextInt();
			int k = scan.nextInt();
			d[u] = -1;
			for (int j = 0; j < k; j++)
				v[u][j] = scan.nextInt();
		}

		d[1] = 0;
		list = new int[n + 1];
		list[0] = 1;

		Bsearch(v, d);

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + d[i]);
		}

		scan.close();
		System.exit(0);
	}

	static int[] list;
	static int pp = 0, pn = 1;

	private static void Bsearch(int[][] v, int[] d) {
		for (; pp < pn; pp++) {
			int fr = list[pp];
			for (int i = 0; i < v[fr].length; i++) {
				int to = v[fr][i];
				if (d[to] == -1) {
					d[to] = d[fr] + 1;
					list[pn++] = to;
				}
			}
		}
	}

}

