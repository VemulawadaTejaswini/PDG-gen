import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();

		StringBuilder sb = new StringBuilder();
		if (k == 0) {
			sb.append(1).append("\n").append("0");
			System.out.println(sb.toString());
			return;
		}

		if (k <= 50) {
			sb.append(k).append("\n");
			for (int i = 1; i <= k; i++) {
				sb.append(i);
				sb.append(" ");
			}
			System.out.println(sb.toString());
			return;
		}
		sb.append(50).append("\n");
		long[] a = new long[50];
		for (int i = 0; i < 50; i++) {
			a[i] = (i + 1) + (k / 50 - 1);
			if (k % 50 > 0 && (i + 1 < k % 50)) {
				a[i]++;
			}
			sb.append(a[i]).append(" ");
		}

		System.out.println(sb.toString());
	}
}
