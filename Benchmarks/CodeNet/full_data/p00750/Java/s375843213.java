import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class A1169 {
	LinkedList<Node> nodeList;
	int G;

	void ans(Scanner sc) {
		while (true) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int S = sc.nextInt();
			G = sc.nextInt();

			if (N == 0) {
				break;
			}

			nodeList = new LinkedList<A1169.Node>();
			for (int i = 0; i < N; i++) {
				nodeList.add(new Node());
			}

			for (int i = 0; i < A; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				String str = sc.next();

				nodeList.get(x).toList.add(new P(y, str));
			}
			
			for (Iterator iterator = nodeList.iterator(); iterator.hasNext();) {
				Node node = (Node) iterator.next();
				Collections.sort(node.toList, new Comparator<P>() {
					@Override
					public int compare(P arg0, P arg1) {
						return -arg0.str.compareTo(arg1.str);
					}
				});
			}

			rec2(S);

			if (nodeList.get(G).last == false) {
				System.out.println("NO");
			} else {
				System.out.println(nodeList.get(G).sb.toString());
			}
		}
	}

	void rec2(int c) {
		Node node = nodeList.get(c);

		if (G == c) {
			ansListSet();
			node.last = true;
			return;
		}

		node.loop = true;

		for (Iterator iterator = node.toList.iterator(); iterator.hasNext();) {
			P p = (P) iterator.next();

			Node n = nodeList.get(p.no);
			if (n.loop == false) {
				String ss = node.sb + p.str;
				if ("".equals(n.sb.toString()) || ss.compareTo(n.sb.toString()) < 0) {
					n.sb.replace(0, n.sb.length(), ss);
					rec2(p.no);
				}
			} else if (n.last) {
				ansListClean();
			}
		}
		node.loop = false;
	}

	void ansListSet() {
		for (Iterator iterator = nodeList.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			n.last = false;
			if (n.loop) {
				n.last = true;
			}
		}
	}

	void ansListClean() {
		for (Iterator iterator = nodeList.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			n.last = false;
		}
	}
	
	

	class Node {
		boolean loop;
		boolean last;
		StringBuilder sb;
		LinkedList<P> toList;

		public Node() {
			loop = false;
			last = false;
			sb = new StringBuilder("");
			toList = new LinkedList<A1169.P>();
		}

		@Override
		public String toString() {
			return sb.toString();
		}
	}

	class P {
		int no;
		String str;

		public P(int no, String str) {
			super();
			this.no = no;
			this.str = str;
		}
	}

}

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new A1169().ans(sc);

	}

}