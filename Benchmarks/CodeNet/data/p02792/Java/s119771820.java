import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = 0;
		int[] d = new int[6];
		int[] counts = new int[] { 1, 1, 10, 100, 1000, 100000 };
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 6; j++) {
				d[j] = i / (int) (Math.pow(10, j)) % 10;
			}
			if (d[0] == 0) {
				continue;
			}
			int dn = String.valueOf(i).length();
			if (d[dn - 1] == d[0]) {
				for (int j = 0; j < dn - 1; j++) {
					result += 2 * counts[j];
				}
				for (int j = 1; j < dn - 1; j++) {
					result += 2 * d[j] * Math.pow(10, j - 1);
				}
				result++;
			} else if (d[dn - 1] > d[0]) {
				for (int j = 1; j < dn; j++) {
					result += 2 * counts[j];
				}
			} else {
				for (int j = 1; j < dn - 1; j++) {
					result += 2 * counts[j];
				}
			}
		}
		sc.close();

		System.out.println(result);
	}
}
