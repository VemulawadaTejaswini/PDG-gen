import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		if (x == 1 || x == 2 * n - 1) {
			System.out.println("No");
		} else if (x == 2) {
			for (int i = 1; i <= n; i++) {
				if (x - 1 == i || x == i || x + 1 == i || x - 2 == i) {
				} else {
					sb.append(i + "\n");
				}
			}
			sb.append(x + 2 + "\n");
			sb.append(x - 1 + "\n");
			sb.append(x + "\n");
			sb.append(x + 1 + "\n");
			for (int i = n + 1; i <= 2 * n - 1; i++) {
				if (x - 1 == i || x == i || x + 1 == i || x - 2 == i) {
				} else {
					sb.append(i + "\n");
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				if (x - 1 == i || x == i || x + 1 == i || x - 2 == i) {
				} else {
					sb.append(i + "\n");
				}
			}
			sb.append(x - 1 + "\n");
			sb.append(x + "\n");
			sb.append(x + 1 + "\n");
			sb.append(x - 2 + "\n");
			for (int i = n + 1; i <= 2 * n - 1; i++) {
				if (x - 1 == i || x == i || x + 1 == i || x - 2 == i) {
				} else {
					sb.append(i + "\n");
				}
			}
		}
		System.out.print(sb);
	}
}