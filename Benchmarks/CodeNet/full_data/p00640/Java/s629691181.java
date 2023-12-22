import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.next();
		scan.next();
		String link = scan.next();
		Main d = new Main(link);
		for (int b = scan.nextInt(); b-- > 0;) {
			d.setA(link, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan
					.nextInt(), scan.next());
		}
		for (; n-- > 1;) {
			link = scan.next();
			for (int b = scan.nextInt(); b-- > 0;) {
				d.setA(link, scan.nextInt(), scan.nextInt(), scan.nextInt(),
						scan.nextInt(), scan.next());
			}
		}
		for (int m = scan.nextInt(); m-- > 0;) {
			String command = scan.next();
			if (command.equals("click")) {
				d.click(scan.nextInt(), scan.nextInt());
			} else if (command.equals("show")) {
				System.out.println(d.show());
			} else if (command.equals("back")) {
				d.back();
			} else if (command.equals("forward")) {
				d.forward();
			}
		}
	}

	public Main(String link) {
		history.add(link);
	}

	LinkedList<String> history = new LinkedList<String>();
	int i = 0;
	Map<String, Set<A>> pages = new HashMap<String, Set<A>>();

	void setA(String page, int left, int top, int right, int bottom, String link) {
		if (!pages.containsKey(page)) {
			pages.put(page, new HashSet<A>());
		}
		pages.get(page).add(new A(left, right, top, bottom, link));
	}

	String show() {
		return history.get(i);
	}

	void click(int x, int y) {
		for (A a : pages.get(history.get(i))) {
			if (a.contains(x, y)) {
				i++;
				while (history.size() > i) {
					history.pollLast();
				}
				history.add(a.toString());
				return;
			}
		}
	}

	void back() {
		if (i > 0) {
			i--;
		}
	}

	void forward() {
		if (i + 1 < history.size()) {
			i++;
		}
	}

	class A {
		int left, right, top, bottom;
		String link;

		public A(int left, int right, int top, int bottom, String link) {
			this.left = left;
			this.right = right;
			this.top = top;
			this.bottom = bottom;
			this.link = link;
		}

		boolean contains(int x, int y) {
			return (left <= x && x <= right) && (top <= y && y <= bottom);
		}

		@Override
		public String toString() {
			return link;
		}
	}
}