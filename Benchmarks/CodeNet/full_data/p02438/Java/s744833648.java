import java.util.Scanner;

// Main
class Main {
	static class Node {
		public Node next;
		public int value;
		public Node(int x) {
			value = x;
		}
	}
	static class List {
		private Node head;
		private Node tail;
		public List() {
			head = new Node(-1);
			tail = head;
		}
		private void reset() {
			head.next = null;
			tail = head;
		}
		public boolean isEmpty() {
			return head.next == null;
		}
		public void insert(int x) {
			Node n =  new Node(x);
			tail.next = n;
			tail = n;
		}
		public void dump() {
			Node n = head.next;
			for (int i = 0; n != null; i++, n = n.next) {
				if (i > 0) {
					System.out.print(" ");
				}
				System.out.print(n.value);
			}
			System.out.println();
		}
		public void splice(List s) {
			if (s.isEmpty()) {
				return;
			}
			tail.next = s.head.next;
			tail = s.tail;
			s.reset();
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			List[] p = new List[n];
			for (int i = 0; i < n; i++) {
				p[i] = new List();
			}
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int c = sc.nextInt();
				int t = sc.nextInt();
				switch (c) {
				case 0:
					int x = sc.nextInt();
					p[t].insert(x);
					break;
				case 1:
					p[t].dump();
					break;
				case 2:
					int s = t;
					t = sc.nextInt();
					p[t].splice(p[s]);
					break;
				}
			}
		}
	}
}

