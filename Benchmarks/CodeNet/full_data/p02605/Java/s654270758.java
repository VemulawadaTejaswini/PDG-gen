import java.awt.Point;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long INF = Long.MAX_VALUE/10;
		Scanner sc = new Scanner(System.in);
		long ans = INF;
		int N = sc.nextInt();
		List<Point> U = new ArrayList<>();
		List<Point> R = new ArrayList<>();
		List<Point> L = new ArrayList<>();
		Map<Point, TreeSet<Integer>> Um = new HashMap<>(), Dm = new HashMap<>();
		Map<Point, TreeSet<Integer>> Um2 = new HashMap<>(), Dm2 = new HashMap<>();
		Map<Integer, TreeSet<Integer>> D2 = new HashMap<>(), L2 = new HashMap<>();
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			String S = sc.next();
			if(S.equals("U")) {
				U.add(new Point(X, Y));
				Point p = new Point(X-Y, 0);
				if(!Um.containsKey(p))
					Um.put(p, new TreeSet<>());
				Um.get(p).add(Y);
				p = new Point(X+Y, 0);
				if(!Um2.containsKey(p))
					Um2.put(p, new TreeSet<>());
				Um2.get(p).add(Y);
			}
			else if(S.equals("R"))
				R.add(new Point(X, Y));
			else if(S.equals("D")) {
				Point p = new Point(X-Y, 0);
				if(!Dm.containsKey(p))
					Dm.put(p, new TreeSet<>());
				Dm.get(p).add(Y);
				p = new Point(X+Y, 0);
				if(!Dm2.containsKey(p))
					Dm2.put(p, new TreeSet<>());
				Dm2.get(p).add(Y);
				if(!D2.containsKey(X))
					D2.put(X, new TreeSet<>());
				D2.get(X).add(Y);
			}
			else {
				L.add(new Point(X, Y));
				if(!L2.containsKey(Y))
					L2.put(Y, new TreeSet<>());
				L2.get(Y).add(X);
			}
		}
		for(Point p : U)
			if(D2.containsKey(p.x) && D2.get(p.x).last() > p.y)
				ans = Math.min(ans, Math.abs(p.y - D2.get(p.x).ceiling(p.y)) * 10 / 2);
		for(Point p : R) {
			if(L2.containsKey(p.y) && L2.get(p.y).last() > p.x)
				ans = Math.min(ans, Math.abs(p.x - L2.get(p.y).ceiling(p.x)) * 10 / 2);
			Point q = new Point(p.x - p.y, 0);
			if(Dm.containsKey(q) && Dm.get(q).last() > p.y)
				ans = Math.min(ans, Math.abs(p.y - Dm.get(q).ceiling(p.y)) * 10);
			q = new Point(p.x + p.y, 0);
			if(Um2.containsKey(q) && Um2.get(q).first() < p.y)
				ans = Math.min(ans, Math.abs(p.y - Um2.get(q).floor(p.y)) * 10);
		}
		for(Point p : L) {
			Point q = new Point(p.x - p.y, 0);
			if(Um.containsKey(q) && Um.get(q).first() < p.y)
				ans = Math.min(ans, Math.abs(p.y - Um.get(q).floor(p.y)) * 10);
			q = new Point(p.x + p.y, 0);
			if(Dm2.containsKey(q) && Dm2.get(q).last() > p.y)
				ans = Math.min(ans, Math.abs(p.y - Dm2.get(q).ceiling(p.y)) * 10);
		}
		System.out.println(ans == INF ? "SAFE" : ans);
	}

}