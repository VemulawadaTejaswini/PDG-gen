import java.util.Scanner;

public class Main {
	private static final String _1 = "1";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		StringBuilder sb = new StringBuilder();
		do {
			sb.setLength(0);
			int[] point = new int[m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (_1.equals(in.next())) {
						point[j] += 1;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				int cp = n - i;
				for (int j = 0; j < m; j++) {
					if (point[j] == cp) {
						sb.append(' ');
						sb.append(j + 1);
					}
				}
			}
			System.out.println(sb.substring(1));
			n = in.nextInt();
			m = in.nextInt();
		} while (n != 0 || m != 0);
		in.close();
	}
}