import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if (n < 6) {
			int[] a = {2, 3, 25, 30, 60};
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				sb.append(a[i]).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		} else {
			int[][] a = {{3, 9, 2, 10, 4, 8, 6, 12}, {6, 3, 9, 2, 10, 4, 8, 12}};
			StringBuilder sb = new StringBuilder();
			int k = n % 2;
			int x = n / 8;
			int y = n % 8;
			for (int i = 0; i < x; i++) {
				int b = 12 * i;
				for (int j = 0; j < 8; j++) {
					sb.append(a[k][j] + b).append(' ');
				}
			}
			int b = 12 * x;
			for (int j = 0; j < y; j++) {
				sb.append(a[k][j] + b).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
