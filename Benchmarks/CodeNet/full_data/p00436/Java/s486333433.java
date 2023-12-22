import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		int n = scan.nextInt();
		int[] c = new int[2 * n];
		for (int i = 0; i < c.length; i++)
			c[i] = i + 1;

		int m = scan.nextInt();
		for (int i = 0; i < m; i++) {
			int op = scan.nextInt();
			if (op == 0)
				refull(c);
			else
				cut(op, c);
		}
		for (int i = 0; i < c.length; i++)
			System.out.println(c[i]);

		scan.close();
		System.exit(0);
	}

	private static void cut(int op, int[] c) {
		int[] w = new int[c.length];
		for (int i = 0; i < c.length; i++)
			w[i] = c[i];
		for (int i = 0, j = op; i < c.length; i++, j++) {
			if (j >= c.length)
				j = 0;
			c[i] = w[j];
		}
	}

	private static void refull(int[] c) {
		int[] w = new int[c.length];
		for (int i = 0; i < c.length; i++)
			w[i] = c[i];
		for (int i = 0, j = 0, k = c.length / 2; i < c.length; i += 2, j++, k++) {
			c[i] = w[j];
			c[i + 1] = w[k];
		}
	}

}