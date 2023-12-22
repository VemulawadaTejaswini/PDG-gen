// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int MD = 1000000007;
	long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	static class V {
		long a, b;
		V(long a, long b) {
			this.a = a; this.b = b;
		}
	}
	void main() {
		int n = sc.nextInt();
		V[] uu = new V[n];
		V[] vv = new V[n];
		int nu = 0, nv = 0;
		int z = 0, pa = 1, pb = 1;
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (a == 0 && b == 0) {
				z++;
				continue;
			}
			if (a == 0) {
				pa = pa * 2 % MD;
				continue;
			}
			if (b == 0) {
				pb = pb * 2 % MD;
				continue;
			}
			if (b < 0) {
				a = -a;
				b = -b;
			}
			long d = gcd(Math.abs(a), b); a /= d; b /= d;
			if (a > 0)
				uu[nu++] = new V(a, b);
			else
				vv[nv++] = new V(b, -a);
		}
		long ans = (pa + pb - 1) % MD;
		Arrays.sort(uu, 0, nu, (u, v) -> Long.signum(u.a != v.a ? u.a - v.a : u.b - v.b));
		Arrays.sort(vv, 0, nv, (u, v) -> Long.signum(u.a != v.a ? u.a - v.a : u.b - v.b));
		for (int i = 0, j = 0; i < nu || j < nv; ) {
			int mode;
			if (j == nv)
				mode = 1;
			else if (i == nu)
				mode = 2;
			else if (uu[i].a < vv[j].a)
				mode = 1;
			else if (uu[i].a > vv[j].a)
				mode = 2;
			else if (uu[i].b < vv[j].b)
				mode = 1;
			else if (uu[i].b > vv[j].b)
				mode = 2;
			else
				mode = 0;
			int pu = 1, pv = 1;
			if (mode != 2) {
				int i_ = i;
				while (i_ < nu && uu[i_].a == uu[i].a && uu[i_].b == uu[i].b) {
					pu = pu * 2 % MD;
					i_++;
				}
				i = i_;
			}
			if (mode != 1) {
				int j_ = j;
				while (j_ < nv && vv[j_].a == vv[j].a && vv[j_].b == vv[j].b) {
					pv = pv * 2 % MD;
					j_++;
				}
				j = j_;
			}
			if (mode == 1)
				ans = ans * pu % MD;
			else if (mode == 2)
				ans = ans * pv % MD;
			else
				ans = ans * (pu + pv - 1) % MD;
		}
		ans = (ans + z - 1) % MD;
		if (ans < 0)
			ans += MD;
		println(ans);
	}
}
