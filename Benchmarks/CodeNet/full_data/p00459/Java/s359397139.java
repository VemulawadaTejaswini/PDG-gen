
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			int r = scanner.nextInt();
			List<Point> v = new ArrayList<Point>();
			v.add(new Point(1, n));
			while (m-- > 0) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				List<Point> a, b, c;
				a = new ArrayList<Point>();
				b = new ArrayList<Point>();
				c = new ArrayList<Point>();
				cut(v, y, c);
				cut(v, x, b);
				a = v;
				v = c;
				v.addAll(b);
				v.addAll(a);
			}
			List<Point> rv = new ArrayList<Point>();
			cut(v, q, rv);
			cut(v, p - 1, rv);
			int ans = 0;
			for (int i = 0; i < rv.size(); i++)
				ans += Math.max(0, Math.min(r - rv.get(i).x + 1, rv.get(i).y));
			System.out.println(ans);
		}
	}

	private void cut(List<Point> v, int x, List<Point> r) {
		r.clear();
		int n = 0;
		int p = 0;
		for (; n + v.get(p).y <= x; n += v.get(p).y, p++)
			;
		Point ns = new Point(v.get(p).x + x - n, v.get(p).y - (x - n));
		r.add(ns);
		for (int j = p + 1; j < v.size(); j++) {
			r.add(new Point(v.get(j).x, v.get(j).y));
		}
		for(int j = p+1;j<v.size();)
			v.remove(j);
		v.get(v.size() - 1).y = x - n;

	}
}