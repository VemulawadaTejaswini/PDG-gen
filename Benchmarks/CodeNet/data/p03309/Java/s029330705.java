import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt() - (i + 1);
		}

		Arrays.sort(x);

		int d = x[n / 2];
		long sadness = 0;
		for (int i = 0; i < n; i++) {
			sadness += Math.abs(x[i] - d);
		}

		System.out.println(sadness);
	}

}
