import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int r = s.nextInt();
			if (n == 0 && r == 0) {
				break;
			}
			int[] values = new int[n];
			for (int i = 0; i < values.length; i++) {
				values[i] = n - i;
			}
			for (int i = 0; i < r; i++) {
				int p = s.nextInt();
				int c = s.nextInt();
				for (int k = p; k > 1; k--) {
					int a = values[k - 2];
					for (int l = 0; l < c; l++) {
						values[k + l - 2] = values[k + l - 1];
					}
					values[k + c - 2 ] = a;
				}

			}
			System.out.println(values[0]);
		}
	}
}