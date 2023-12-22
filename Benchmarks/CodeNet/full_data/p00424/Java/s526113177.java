import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n;
		while ((n = in.nextInt()) != 0) {
			char[][] h = new char[n][2];
			for (char[] c : h) {
				c[0] = in.next().charAt(0);
				c[1] = in.next().charAt(0);
			}
			int m = in.nextInt();
			sb.setLength(0);
			for (int i = 0; i < m; i++) {
				char ac = in.next().charAt(0);
				for (char[] c : h) {
					if (ac == c[0]) {
						ac = c[1];
						break;
					}
				}
				sb.append(ac);
			}
			System.out.println(sb.toString());
		}
	}
}