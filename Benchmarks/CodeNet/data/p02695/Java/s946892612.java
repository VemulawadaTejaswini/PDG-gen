import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static List<A> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			list.add(new A(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();

		int max = search(0, n, 1, m, new ArrayList<>());
		System.out.println(max);

	}

	public static int search(int a, int n, int s, int e, List<Integer> l) {
		int max = 0;
		for (int i = s; i <= e; i++) {
			l.add(i);
			int sum = 0;
			if (a == n) {
				for (A la : list) {
					if (l.get(la.b) - l.get(la.a) == la.c) {
						sum += la.d;
					}
				}
			} else {
				sum = search(a + 1, n, i, e, l);
			}
			max = Math.max(max, sum);
			l.remove(l.size() - 1);
		}
		return max;
	}

	public static class A {
		public int a;
		public int b;
		public int c;
		public int d;

		public A() {

		}

		public A(int a, int b, int c, int d) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
	}
}
