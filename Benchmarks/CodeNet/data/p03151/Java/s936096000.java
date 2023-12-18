import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < n; i++) {
			points[i] = new Point();
			points[i].a = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			points[i].b = sc.nextInt();
		}
		Arrays.sort(points, new Comparator<Point>() {
		public int compare(Point p1, Point p2) {
			return p1.getSa() - p2.getSa();
		}
		});
		
		int aIdx = 0;
		int bIdx = n - 1;
		int cnt = 0;
		int sa = 0;
		while (true) {
			int tmp = points[aIdx].getSa();
			if (tmp >= 0) {
				System.out.println(cnt);
				return;
			}
			sa += tmp;
			cnt++;
			aIdx++;
			if (cnt > n) {
				System.out.println(-1);
				return;
			}
			while (sa < 0) {
				sa += points[bIdx].getSa();
				bIdx--;
				cnt++;
				if (cnt > n) {
					System.out.println(-1);
					return;
				}
			}
		}
	}
	
	static class Point {
		int a;
		int b;
		
		public int getSa() {
			return a - b;
		}
	}
}
