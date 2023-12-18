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
		PrintWriter pw = new PrintWriter(System.out);
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

		ArrayDeque<Double> dequeW = new ArrayDeque<>();
		ArrayDeque<Double> dequeS = new ArrayDeque<>();
		dequeS.add(0d);
		dequeW.add(0d);
		dequeS.addLast(t[0] * v[0]);
		dequeW.addLast(v[0]);
		T p = new T(0, 0);
		pw.println(t[0]);
		for (int i = 1; i < N; ++i) {
			p.water += v[i];
			p.salt += t[i] * v[i];
			dequeW.addFirst(-p.water);
			dequeS.addFirst(-p.water * p.salt);

			while (dequeS.size() >= 2) {
				double t2w = dequeW.pollLast();
				double t2s = dequeS.pollLast();
				double t1w = dequeW.pollLast();
				double t1s = dequeS.pollLast();
				if (t1w + p.water > L && t2w + p.water > L)
					continue;
				if (t1w + p.water == L) {
					dequeW.addLast(t1w);
					dequeS.addLast(t1s);
					break;
				}
				if (t1w + p.water < L && L < t2w + p.water) {
					double r1 = (t2w + p.water - L) / (t2w - t1w);
					double r2 = (L - (t1w + p.water)) / (t2w - t1w);
					double tLasts = r1 * (t1s + p.salt) + r2 * (t2s + p.salt);
					double tLastw = r1 * (t1w + p.water) + r2 * (t2w + p.water);

					tLastw -= p.water;
					tLasts -= p.salt;
					dequeS.addLast(t1s);
					dequeW.addLast(t1w);

					dequeS.addLast(tLasts);
					dequeW.addLast(tLastw);
					break;
				}
			}
			dequeS.pollFirst();
			dequeW.pollFirst();

			while (dequeS.size() >= 2) {
				double t1s = dequeS.pollFirst();
				double t1w = dequeW.pollFirst();
				double t2s = dequeS.pollFirst();
				double t2w = dequeW.pollFirst();
				if ((t1s + p.salt) / (t1w + p.water) > (t2s + p.salt) / (t2w + p.water)) {
					dequeS.addFirst(t2s);
					dequeW.addFirst(t2w);
					dequeS.addFirst(t1s);
					dequeW.addFirst(t1w);
					break;
				}
				dequeS.addFirst(t2s);
				dequeW.addFirst(t2w);
			}
			dequeS.addFirst(-p.salt);
			dequeW.addFirst(-p.water);

			pw.println((dequeS.peekLast() + p.salt) / (dequeW.peekLast() + p.water));
		}
		pw.close();

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}