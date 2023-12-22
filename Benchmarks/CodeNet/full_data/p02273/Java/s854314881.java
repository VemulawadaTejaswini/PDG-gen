import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private class Point {
		double x, y;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		reader.close();
		
		Point a = new Point();
		Point b = new Point();
		a.x = 0;
		a.y = 0;
		b.x = 100;
		b.y = 0;
		print(a);
		koch(n, a, b);
		print(b);
	}
	
	private void koch(int n, Point a, Point b) {
		if (n == 0) return;
		Point s = new Point();
		Point t = new Point();
		Point u = new Point();
		double th = Math.PI * 60.0 / 180.0;
		
		s.x = (2.0 * a.x + 1.0 * b.x) / 3.0;
		s.y = (2.0 * a.y + 1.0 * b.y) / 3.0;
		t.x = (1.0 * a.x + 2.0 * b.x) / 3.0;
		t.y = (1.0 * a.y + 2.0 * b.y) / 3.0;
		u.x = (t.x - s.x) * Math.cos(th) - (t.y - s.y) * Math.sin(th) + s.x;
		u.y = (t.x - s.x) * Math.sin(th) + (t.y - s.y) * Math.cos(th) + s.y;
		
		koch(n - 1, a, s);
		print(s);
		koch(n - 1, s, u);
		print(u);
		koch(n - 1, u, t);
		print(t);
		koch(n - 1, t, b);
	}

	private void print(Point p) {
		System.out.println(String.format("%.8f %.8f", p.x, p.y));
	}
}

