import java.awt.Point;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Stack<Point> table = new Stack<Point>();
			for (int i = 1; i <= n; i++) {
				int s = sc.nextInt();
				if (i % 2 == 0) {
					if (table.peek().x == s) {
						Point p = table.pop();
						p.y++;
						table.push(p);
					} else {
						Point p = table.pop();
						if (table.empty()) {
							p.x ^= 1;
							p.y++;
							table.push(p);
						} else {
							Point pp = table.pop();
							pp.y += p.y + 1;
							table.push(pp);
						}
					}
				} else {
					if (table.empty()) {
						table.push(new Point(s, 1));
					} else if (table.peek().x == s) {
						Point p = table.pop();
						p.y++;
						table.push(p);
					} else {
						table.push(new Point(s, 1));
					}
				}
				// System.out.println(i);
				// System.out.println(table);
			}
			int ans = 0;

			while (!table.empty()) {
				Point p = table.pop();
				if (p.x == 0) {
					ans += p.y;
				}
			}
			System.out.println(ans);
		}
	}
}