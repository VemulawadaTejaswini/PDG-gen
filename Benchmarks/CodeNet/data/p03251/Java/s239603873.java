import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] x = new int[n + 1];
		int[] y = new int[m + 1];
		x[0] = in.nextInt();
		y[0] = in.nextInt();

		for (int i = 1; i < n + 1; i++) {
			x[i] = in.nextInt();
		}
		for (int i = 1; i < m + 1; i++) {
			y[i] = in.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);

		if (y[0] <= x[x.length - 1]) {
			System.out.println("War");
		} else {
			System.out.println("No War");
		}

	}

}