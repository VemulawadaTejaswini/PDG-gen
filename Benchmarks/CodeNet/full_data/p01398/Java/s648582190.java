import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			char[] msg = sc.next().toCharArray();
			Point swap[] = new Point[n];
			for (int i = n - 1; i >= 0; i--) {
				swap[i] = new Point(sc.nextInt(), sc.nextInt());
			}
			for (int i = 0; i < n; i++) {
				int a = swap[i].x;
				int b = swap[i].y;
				int dis = Math.abs(a - b);
				msg[a - 1] = (char) ('a' + (((msg[a - 1] - 'a') + dis) % 26));
				msg[b - 1] = (char) ('a' + (((msg[b - 1] - 'a') + dis) % 26));
				char c = msg[a - 1];
				msg[a - 1] = msg[b - 1];
				msg[b - 1] = c;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(msg);
			System.out.println(sb.toString());
		}
	}

}