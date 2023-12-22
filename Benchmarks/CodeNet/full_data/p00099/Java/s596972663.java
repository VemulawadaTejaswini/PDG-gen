import java.util.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		sc.nextInt();
		int q = sc.nextInt();
		C c = new C();
		Queue<Pair> queue = new PriorityQueue<Pair>(1000 * 1000, c);
		Map<Integer, Pair> map = new HashMap<Integer, Pair>();
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int v = sc.nextInt();
			if (!map.containsKey(a)) {
				Pair p = new Pair(a, v);
				map.put(a, p);
				queue.add(p);
			} else {
				Pair p = map.get(a);
				queue.remove(p);
				p.b += v;
				queue.add(p);
			}
			Pair pp = queue.peek();
			System.out.println(pp.a + " " + pp.b);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}
}

class C implements Comparator<Pair> {

	public int compare(Pair o1, Pair o2) {
		if (o1.b == o2.b) {
			return o1.a - o2.a;
		}
		return o2.b - o1.b;
	}

}

class Pair {
	public int a;
	public int b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}