import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		// long t = System.currentTimeMillis();
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
		// System.err.println(System.currentTimeMillis() - t);
	}

	class State {
		protected double srct;
		protected double dstt;
		protected int a;
		protected double srcv;
		protected double dstv;

		public State(double srct_, double dstt_, int a_, double srcv_) {
			srct = srct_;
			dstt = dstt_;
			a = a_;
			srcv = srcv_;
			dstv = srcv + a * (dstt - srct);
		}
	}

	void solve(int n, double[] t, double[] dt, double[] v) {
		ArrayDeque<State> dq = new ArrayDeque<>();
		dq.add(new State(-1, 0, 0, 0));
		for (int i = 0; i < n; ++i) {
			while (i > 0 && true) {
				State s = dq.peekLast();
				if (s.srcv - (t[i - 1] - s.srct) <= v[i])
					break;
				else {
					dq.pollLast();
				}
			}
			State ps = dq.peekLast();
			if (ps.dstv > v[i]) {
				dq.pollLast();
				double T = t[i - 1] - ps.srct;
				double ddt = (v[i] + T - ps.srcv) / (1 + ps.a);
				ps.dstt = ps.srct + ddt;
				ps.dstv = ps.srcv + (ps.dstt - ps.srct) * ps.a;
				dq.addLast(ps);
				dq.add(new State(ps.dstt, t[i - 1], -1, ps.dstv));
			}
			ps = dq.peekLast();
			if (ps.dstv + dt[i] > v[i]) {
				dq.addLast(new State(ps.dstt, ps.dstt + v[i] - ps.dstv, 1, ps.dstv));
				dq.addLast(new State(ps.dstt + v[i] - ps.dstv, t[i], 0, v[i]));
			} else {
				dq.addLast(new State((i > 0 ? t[i - 1] : 0), t[i], 1, ps.dstv));
			}
		}

		double ans = 0;
		for (State state : dq) {
			double ddt = state.dstt - state.srct;
			ans += ddt * state.srcv + ddt * ddt * state.a * 0.5;
		}
		System.out.println(ans);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] t = new double[n + 1];
		double[] dt = new double[n + 1];
		double[] v = new double[n + 1];
		for (int i = 0; i < n; ++i) {
			t[i] = sc.nextDouble();
			dt[i] = t[i];
			if (i > 0)
				t[i] = t[i - 1] + t[i];
		}
		for (int i = 0; i < n; ++i) {
			v[i] = sc.nextDouble();
		}
		++n;
		v[n - 1] = 0;
		t[n - 1] = t[n - 2];
		dt[n - 1] = 0;
		solve(n, t, dt, v);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}