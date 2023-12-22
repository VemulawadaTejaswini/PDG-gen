import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, p, q, r;
		while ((n = in.nextInt()) > 0) {
			m = in.nextInt();
			p = in.nextInt() - 1;
			q = in.nextInt();
			r = in.nextInt();
			Deque<Integer> allDeque = getNewDeque();
			allDeque.add(Integer.valueOf(r));
			allDeque.add(Integer.valueOf(n - r));
			Deque<Integer> a = getNewDeque();
			Deque<Integer> c = getNewDeque();
			boolean top = true;
			boolean bottom = false;
			for (int i = 0; i < m; i++) {
				boolean atop = top, abottm, ctop, cbottom = bottom;
				int asize = in.nextInt();
				a.clear();
				while (asize >= allDeque.peekFirst().intValue()) {
					top = !top;
					final Integer first = allDeque.removeFirst();
					a.addLast(first);
					asize -= first.intValue();
				}
				if (asize != 0) {
					a.addLast(Integer.valueOf(asize));
					final Integer first = allDeque.removeFirst();
					allDeque.addFirst(Integer.valueOf(first - asize));
				}
				abottm = (a.size() % 2 == 1) ? atop : !atop;
				int csize = n - in.nextInt();
				c.clear();
				while (csize >= allDeque.peekLast().intValue()) {
					bottom = !bottom;
					final Integer last = allDeque.removeLast();
					c.addFirst(last);
					csize -= last.intValue();
				}
				if (csize != 0) {
					c.addFirst(Integer.valueOf(csize));
					final Integer last = allDeque.removeLast();
					allDeque.addLast(Integer.valueOf(last - csize));
				}
				ctop = (c.size() % 2 == 1) ? cbottom : !cbottom;
				if (atop == bottom) {
					int afirst = a.removeFirst().intValue();
					allDeque.addLast(Integer.valueOf(afirst
							+ allDeque.removeLast().intValue()));
				}
				if (cbottom == top) {
					int clast = c.removeLast().intValue();
					allDeque.addFirst(Integer.valueOf(clast
							+ allDeque.removeFirst().intValue()));
				}
				Deque<Integer> b = allDeque;
				allDeque = c;
				c = b;
				allDeque.addAll(b);
				allDeque.addAll(a);
				top = ctop;
				bottom = abottm;
			}
			while (p >= allDeque.peekFirst().intValue()) {
				final int val = allDeque.removeFirst().intValue();
				q -= val;
				p -= val;
				top = !top;
			}
			int count = (top) ? -p : 0;
			while (q >= allDeque.peekFirst().intValue()) {
				final int intValue = allDeque.removeFirst().intValue();
				q -= intValue;
				if (top)
					count += intValue;
				top = !top;
			}
			if (top) {
				count += q;
			}
			System.out.println(count);
		}
	}

	private static Deque<Integer> getNewDeque() {
		return new ArrayDeque<Integer>();
	}
}