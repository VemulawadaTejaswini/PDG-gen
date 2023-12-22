import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		StringBuilder sb = new StringBuilder();
		do {
			int[] point = new int[m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					point[j] += in.nextInt();
				}
			}
			sb.setLength(0);
			for (int i = 0; i < n; i++) {
				int cp = n - i;
				for (int j = 0; j < m; j++) {
					if (point[j] == cp) {
						if (i != 0) {
							sb.append(' ');
						}
						sb.append(j + 1);
					}
				}
			}
			System.out.println(sb.toString());
			n = in.nextInt();
			m = in.nextInt();
		} while (n != 0 || m != 0);
		in.close();
	}
}