import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int[] y = new int[m];
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
		}
		sc.close();

		int max = X;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, x[i]);
		}
		int min = Y;
		for (int i = 0; i < m; i++) {
			min = Math.min(min, y[i]);
		}
		if (max < min) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}
}
