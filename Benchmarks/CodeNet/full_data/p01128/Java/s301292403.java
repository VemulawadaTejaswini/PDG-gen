import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int N = nextInt();
		for (int k = 0; k < N; k++) {
			P A = new P(nextInt(), nextInt());
			P B = new P(nextInt(), nextInt());

			int n = nextInt();

			Geo2D geo2d = new Geo2D();

			ArrayList<CrossPoint> list = new ArrayList<CrossPoint>();
			for (int i = 0; i < n; i++) {
				P S = new P(nextInt(), nextInt());
				P T = new P(nextInt(), nextInt());

				int o = nextInt();// 1ならば自社
				int l = nextInt();// 0ならば地下

				if (o == 0) {
					// 他社なら反転
					l = (l + 1) % 2;
				}

				if (geo2d.cross(A, B, S, T)) {
					P crossP = geo2d.intersection_ls(A, B, S, T);
					list.add(new CrossPoint(crossP.x, crossP.y, l == 0));
				}
			}
			Collections.sort(list);

			boolean now = true;
			int ans = 0;
			for (int i = 0; i < list.size(); i++) {
				if (i != 0 && now != list.get(i).under) {
					ans++;
				}
				now = list.get(i).under;
			}
			System.out.println(ans);

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}

class CrossPoint implements Comparable<CrossPoint> {
	double x, y;
	boolean under;// 地下ならtrue
	double EPS = 1e-9;

	public CrossPoint(double x, double y, boolean under) {
		this.x = x;
		this.y = y;
		this.under = under;
	}

	public int compareTo(CrossPoint o) {
		// 基本x座標で昇順にソートしつつ、同じならy座標でソートする
		if (Math.abs(x - o.x) > EPS)
			return (int) Math.signum(x - o.x);
		else
			return (int) Math.signum(y - o.y);
	}
}

class P implements Comparable<P> {
	double x, y;
	double EPS = 1e-9;

	public P(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public int compareTo(P o) {
		if (Math.abs(x - o.x) > EPS)
			return (int) Math.signum(x - o.x);
		else
			return (int) Math.signum(y - o.y);
	}
}

// 平面幾何系ライブラリもどき
class Geo2D {

	double EPS = 1e-9;

	/* 線分abと線分stは交差するか */
	boolean cross(P a, P b, P s, P t) {
		if (ex(a, b, s) * ex(a, b, t) > 0)
			return false;
		if (ex(b, a, s) * ex(b, a, t) > 0)
			return false;
		if (ex(t, s, a) * ex(t, s, b) > 0)
			return false;
		return ex(s, t, a) * ex(s, t, b) < EPS;
	}

	/* ベクトルstとsrの外積 */
	double ex(P s, P t, P r) {
		double x1 = t.x - s.x;
		double y1 = t.y - s.y;
		double x2 = r.x - s.x;
		double y2 = r.y - s.y;
		return x1 * y2 - x2 * y1;
	}

	// a1,a2を端点とする線分とb1,b2を端点とする線分の交点計算
	P intersection_ls(P a1, P a2, P b1, P b2) {
		double d1 = Math.abs(ex(b1, a1, b2));
		double d2 = Math.abs(ex(b1, a2, b2));
		double t = d1 / (d1 + d2);
		return new P(a1.x + (a2.x - a1.x) * t, a1.y + (a2.y - a1.y) * t);
	}

	/* 線分abと点Pの距離 */
	double dist(P a, P b, P p) {
		double x1 = b.x - a.x;
		double y1 = b.y - a.y;
		double x2 = p.x - a.x;
		double y2 = p.y - a.y;
		return Math.abs((x1 * y2 - x2 * y1)) / Math.hypot(x1, y1);
	}

	/* 点pは線分ab上にあるかどうか */
	boolean on(P a, P b, P p) {
		if (Math.abs(a.x - b.x) < EPS)
			return Math.min(a.y, b.y) <= p.y && p.y <= Math.max(a.y, b.y);
		double alpha = (b.y - a.y) / (b.x - a.x);
		double beta = a.y - alpha * a.x;
		if (Math.abs(p.y - (alpha * p.x + beta)) > EPS)
			return false;
		return Math.min(a.x, b.x) <= p.x && p.x <= Math.max(a.x, b.x);
	}
}