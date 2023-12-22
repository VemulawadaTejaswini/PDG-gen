import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedSet;

class A1169 {
	LinkedList<Node> nodeList;
	LinkedList<Node> ansList;
	boolean head;
	boolean b;
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

			ansList = new LinkedList<A1169.Node>();
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

			head = true;
			b = true;

			rec2(S);

			if (nodeList.get(G).ab == false) {
				System.out.println("NO");
			} else {
				System.out.println(nodeList.get(G).sb.toString());
			}
		}
	}

	boolean rec(int c) {
		Node node = nodeList.get(c);

		if (G == c) {
			ansList.clear();
			ansList.addFirst(node);
			return true;
		}

		node.loop = 1;

		LinkedList<P> list = node.toList;
		Collections.sort(list, new Comparator<P>() {
			@Override
			public int compare(P arg0, P arg1) {
				return -arg0.str.compareTo(arg1.str);
			}
		});

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			P p = (P) iterator.next();

			Node n = nodeList.get(p.no);
			if (n.loop == 0) {
				String ss = node.sb + p.str;
				if ("".equals(n.sb) || ss.compareTo(n.sb) < 0) {
					n.sb = ss;
					node.sm = rec(p.no);
					if (node.sm) {
						ansList.addFirst(node);
					}
				}
			}
		}
		node.loop = 0;

		return node.sm;
	}

	void rec2(int c) {
		Node node = nodeList.get(c);

		if (G == c) {
			ansListSet();
			node.ab = true;
			return;
		}

		node.loop = 1;

		LinkedList<P> list = node.toList;
		Collections.sort(list, new Comparator<P>() {
			@Override
			public int compare(P arg0, P arg1) {
				return -arg0.str.compareTo(arg1.str);
			}
		});

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			P p = (P) iterator.next();

			Node n = nodeList.get(p.no);
			if (n.loop == 0) {
				String ss = node.sb + p.str;
				if ("".equals(n.sb) || ss.compareTo(n.sb) < 0) {
					n.sb = ss;
					rec2(p.no);
				}
			} else if(n.ab){
				ansListClean();
			}
		}
		node.loop = 0;
	}

	void ansListSet() {
		for (Iterator iterator = nodeList.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			if (n.loop == 1) {
				n.ab = true;
			}else{
				n.ab = false;
			}
		}
	}

	void ansListClean() {
		for (Iterator iterator = nodeList.iterator(); iterator.hasNext();) {
			Node n = (Node) iterator.next();
			n.ab = false;
		}
	}

	class Node {
		int loop;
		String sb;
		LinkedList<P> toList;
		boolean sm;
		boolean ab;

		public Node() {
			loop = 0;
			sb = "";
			sm = false;
			ab = false;
			toList = new LinkedList<A1169.P>();
		}

		@Override
		public String toString() {
			return sb;
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