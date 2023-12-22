import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int cas=0;
		while (true) {
			cas++;
			int n = sc.nextInt();
			if(n==0)break;
			ArrayList<P> plist = new ArrayList<P>();
			for (int i =0;i<n;i++) {
				plist.add(new P(sc.nextDouble(),sc.nextDouble()));
			}
			ln(String.format("%d %.1f",cas,-P.getS(plist)));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}


class P {
	double x, y;
	public static final double EPS = 1e-10;

	P(double _x, double _y) {
		x = _x;
		y = _y;
	}

	public static final P Xunit = new P(1, 0);
	public static final P Yunit = new P(0, 1);
	public static final P O = new P(0, 0);
	public static double cross(P a, P b) {
		return a.x * b.y - a.y * b.x;
	}
	public P s(P a) {
		return new P(x - a.x, y - a.y);
	}
	public static double getS(List<P> plist) {
		P o1 = plist.get(0);
		P prev = plist.get(1);
		double S = 0;
		for (P p : plist.subList(2, plist.size())) {
			S += getS(o1, prev, p);
			prev = p;
		}
		return S;
	}
	// 負値がかえることもあるので注意。
	public static double getS(P o, P a, P b) {
		return cross(a.s(o), b.s(o)) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P) {
			P p = (P) obj;
			return x == p.x && y == p.y;
		}
		return false;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}