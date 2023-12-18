import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int[] x = new int[3];
		int[] y = new int[3];
		int[] z = new int[3];
		String ans = "No";

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			y[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			z[i] = sc.nextInt();
		}
		
		if (x[0] - x[1] == y[0] - y[1] && z[0] - z[1] == y[0] - y[1] && x[0] - x[1] == z[0] - z[1]) {
			if (x[1] - x[2] == y[1] - y[2] && z[1] - z[2] == y[1] - y[2] && x[1] - x[2] == z[1] - z[2]) {
				if (x[2] - x[0] == y[2] - y[0] && z[2] - z[0] == y[2] - y[0] && x[2] - x[0] == z[2] - z[0]) {
					ans = "Yes";
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
