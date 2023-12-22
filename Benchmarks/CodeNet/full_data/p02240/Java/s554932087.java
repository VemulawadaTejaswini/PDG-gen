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
		int m = scan.nextInt();

		boolean[][] sns = new boolean[n][n];
		for (int i = 0; i < n; i++)
			sns[i][i] = true;

		for (int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			sns[s][t] = true;
			sns[t][s] = true;
		}

		while (MatM(sns))
			;

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			if (sns[s][t])
				System.out.println("yes");
			else
				System.out.println("no");
		}

		scan.close();
		System.exit(0);
	}

	private static boolean MatM(boolean[][] sns) {
		int n = sns.length;
		boolean[][] r = new boolean[n][n];

		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++)
				for (int i = 0; i < n; i++)
					if (sns[x][i] && sns[i][y]) {
						r[x][y] = true;
						break;
					}
		boolean chg = false;
		for (int x = 0; x < n; x++)
			for (int y = 0; y < n; y++) {
				if (sns[x][y] ^ r[x][y])
					chg = true;
				sns[x][y] = r[x][y];
			}

		return chg;
	}

}