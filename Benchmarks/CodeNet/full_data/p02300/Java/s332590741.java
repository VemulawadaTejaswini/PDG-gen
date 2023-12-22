import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	static final double EPS = 0.00000000001;
	static final int COUNTER_CLOCKWISE = 1;
	static final int CLOCKWISE = -1;
	static final int ONLINE_BACK = 2;
	static final int ONLINE_FRONT = -2;
	static final int ON_SEGMENT = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Point> s = new ArrayList<Point>();
		for(int i = 0; i < n; i++) {
			s.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		sc.close();
		List<Point> l = andrewScan(s);
		System.out.println(l.size());
		for(int i = 0; i < l.size(); i++) {
			System.out.println((int)l.get(i).x + " " + (int)l.get(i).y);
		}
	}
	static List<Point> andrewScan(List<Point> s){
		List<Point> u = new ArrayList<Point>();
		List<Point> l = new ArrayList<Point>();
		if(s.size() < 3) return s;
		Collections.sort(s, new MyComp(1));
//		for(int i = 0; i < s.size(); i++) {
//			System.out.printf("%d %d %d\n", i, s.get(i).x, s.get(i).y);
//		}
		// x が小さいものから2つ u に追加
		u.add(s.get(0));
		u.add(s.get(1));
		// x が大きいものから2つ l に追加
		l.add(s.get(s.size() - 1));
		l.add(s.get(s.size() - 2));

		// 凸包の上部を生成
		for(int i = 2; i < s.size(); i++) {
			for(int n = u.size(); n >= 2 && ccw(u.get(n - 2), u.get(n - 1), s.get(i)) != CLOCKWISE; n--) {
				u.remove(u.size() - 1);
			}
			u.add(s.get(i));
		}

		// 凸包の下部を生成
		for(int i = s.size() - 3; i >= 0; i--) {
			for(int n = l.size(); n >= 2 && ccw(l.get(n - 2), l.get(n - 1) , s.get(i)) != CLOCKWISE; n--) {
				l.remove(l.size() - 1);
			}
			l.add(s.get(i));
		}

		// 時計回りになるように凸包の点を列に生成
		Collections.reverse(l);
		for(int i = u.size() - 2; i >= 1; i--) {
			l.add(u.get(i));
		}
		return l;
	}
	static class Point{
		double x, y;
		Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
	static class MyComp implements Comparator<Point>{
		int sign;
		MyComp(int sign) {
			this.sign = sign;
		}
		public int compare(Point p1, Point p2) {
			if(p1.y < p2.y) {
				return -1 * sign;
			}else if(p1.y == p2.y) {
				if(p1.x < p2.x) {
					return -1 * sign;
				}else if(p1.x == p2.x) {
					return 0;
				}else {
					return 1 * sign;
				}
			}else {
				return 1 * sign;
			}
		}
	}

	static int ccw(Point p0, Point p1, Point p2) {
		Point a = vec(p0, p1);
		Point b = vec(p0, p2);
		if(cross(a, b) > EPS) return COUNTER_CLOCKWISE;
		if(cross(a, b) < EPS) return CLOCKWISE;
		if(dot(a, b) < EPS) return ONLINE_BACK;
		if(norm(a) < norm(b)) return ONLINE_FRONT;
		return ON_SEGMENT;
	}
	static double norm(Point p) {
		return p.x * p.x + p.y * p.y;
	}
	static Point vec(Point p1, Point p2) {
		return new Point(p2.x - p1.x, p2.y - p1.y);
	}
	static double dot(Point u, Point v) {
		return u.x * v.x + u.y * v.y;
	}
	static double cross(Point u, Point v) {
		return u.x * v.y - u.y * v.x;
	}
}
