import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long L = sc.nextLong();
		double[] t = new double[N];
		double[] v = new double[N];
		for (int i = 0; i < N; ++i) {
			t[i] = sc.nextDouble();
			v[i] = sc.nextDouble();
		}
		class T {
			double water;
			double salt;

			public T(double water, double salt) {
				this.water = water;
				this.salt = salt;
			}
		}

		double[] ans = new double[N];
		ArrayDeque<T> deque = new ArrayDeque<>();
		deque.addLast(new T(0, 0));
		deque.addLast(new T(v[0], t[0] * v[0]));
		T p = new T(0, 0);
		ans[0] = t[0];
		for (int i = 1; i < N; ++i) {
			p.water += v[i];
			p.salt += t[i] * v[i];
			deque.addFirst(new T(-p.water, -p.water * p.salt));
			while (deque.size() >= 2) {
				T t2 = deque.pollLast();
				T t1 = deque.pollLast();
				if (t1.water + p.water > L && t2.water + p.water > L)
					continue;
				if (t1.water + p.water == L) {
					deque.addLast(t1);
					break;
				}
				if (t1.water + p.water < L && L < t2.water + p.water) {
					double r1 = (t2.water + p.water - L) / (t2.water - t1.water);
					double r2 = (L - (t1.water + p.water)) / (t2.water - t1.water);
					T tLast = new T(r1 * (t1.water + p.water) + r2 * (t2.water + p.water),
							r1 * (t1.salt + p.salt) + r2 * (t2.salt + p.salt));
					tLast.water -= p.water;
					tLast.salt -= p.salt;
					deque.addLast(t1);
					deque.addLast(tLast);
					break;
				}
			}
			deque.pollFirst();
			while (deque.size() >= 2) {
				T t1 = deque.pollFirst();
				T t2 = deque.pollFirst();
				if ((t1.salt + p.salt) / (t1.water + p.water) > (t2.salt + p.salt) / (t2.water + p.water)) {
					deque.addFirst(t2);
					deque.addFirst(t1);
					break;
				}
				deque.addFirst(t2);
			}
			deque.addFirst(new T(-p.water, -p.salt));
			ans[i] = (deque.peekFirst().salt + p.salt) / (deque.peekFirst().water + p.water);
			if (deque.size() < 2)
				throw new AssertionError();
			ans[i] = (deque.peekLast().salt + p.salt) / (deque.peekLast().water + p.water);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < N; ++i) {
			pw.println(ans[i]);
		}
		pw.close();

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}