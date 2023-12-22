import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair<A, B> {
	A car;
	B cdr;

	public Pair(A _car, B _cdr) {
		car = _car;
		cdr = _cdr;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Pair)) {
			return false;
		}
		Pair<?, ?> p = (Pair<?, ?>) o;

		return ((car == null && p.car == null) || (car != null & car.equals(p.car)))
				&& ((cdr == null && p.cdr == null) || (cdr != null & cdr.equals(p.cdr)));

	}

	@Override
	public int hashCode() {
		return (car == null ? 0 : car.hashCode()) ^ (cdr == null ? 0 : cdr.hashCode());
	}

	@Override
	public String toString() {
		return asList().toString();
	}

	public List<Object> asList() {
		List<Object> l = new ArrayList<>();
		l.add(car);
		if (cdr instanceof Pair) {
			l.addAll(((Pair<?, ?>) cdr).asList());
		} else {
			l.add(cdr);
		}
		return l;
	}
}

class Tuple1<A> extends Pair<A, Object> {
	public Tuple1(A a) {
		super(a, null);
	}

	@Override
	public List<Object> asList() {
		List<Object> l = new ArrayList<>();
		l.add(car);
		return l;
	}

}

class Tuple2<A, B> extends Pair<A, Tuple1<B>> {
	public Tuple2(A a, B b) {
		super(a, new Tuple1<B>(b));
	}
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int V, E, r;
	List<List<List<Integer>>> g; // [t, d] のリスト

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		V = sc.nextInt();
		E = sc.nextInt();
		r = sc.nextInt();

		g = new ArrayList<>();
		for (int i = 0; i <= V; i++) {
			g.add(new ArrayList<>());
		}

		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();

			g.get(s).add(Arrays.asList(t, d));
//			g.get(t).add(Arrays.asList(s, d)); //有向だった・・・
		}

		sc.close();

		long[] c = new long[V];
		Arrays.fill(c, Long.MAX_VALUE);
		c[r] = 0;

		PriorityQueue<Tuple2<Integer, Long>> q = new PriorityQueue<>((a, b) -> (Long.compare(a.cdr.car, b.cdr.car)));
		q.add(new Tuple2<Integer, Long>(r, 0L));

		boolean[] v = new boolean[V];

		while (!q.isEmpty()) {
			int a = q.peek().car;
			long b = q.peek().cdr.car;
			q.poll();

			if (v[a]) {
				continue;
			}

			v[a] = true;
			c[a] = b;

			for (List<Integer> x : g.get(a)) {
				q.add(new Tuple2<Integer, Long>(x.get(0), b + x.get(1)));
			}
		}

		for (int i = 0; i < V; i++) {
			if (c[i] == Long.MAX_VALUE) {
				out.println("INF");
			} else {
				out.println(c[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

