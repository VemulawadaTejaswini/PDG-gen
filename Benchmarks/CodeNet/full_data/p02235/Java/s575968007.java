
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int l = 0; l < q; l++) {

			char[] x = (" "+in.next()).toCharArray();
			char[] y = (" "+in.next()).toCharArray();
			int[][] c = new int[x.length][y.length];

			for (int i = 1; i < x.length; i++) {
				for (int j = 1; j < y.length; j++) {
					if (x[i] == y[j]) {
						c[i][j] = c[i-1][j-1] + 1;
					} else if (x[i] != y[j]) {
						c[i][j] = Math.max(c[i][j-1], c[i-1][j]);
					}
				}
			}
			System.out.println(c[x.length-1][y.length-1]);
		}
		in.close();
	}
}

