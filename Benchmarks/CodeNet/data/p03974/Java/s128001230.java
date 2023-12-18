import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			tree.add(s[i]);
		}
		int q = sc.nextInt();
		//int k[] = new int[q];
		//String p[] = new String[q];
		for (int i = 0; i < q; i++) {
			//k[i] = sc.nextInt() - 1;
			//p[i] = sc.next();
			//System.out.println(tree.order(s[k[i]], p[i]));
			System.out.println(tree.order(s[sc.nextInt() - 1], sc.next()));
		}
	}
}

class Tree {
	public Node root;

	public Tree() {
		root = new Node();
	}

	public void add(String s) {
		Node node = root;
		int l = s.length();
		for (int i = 0; i <= l; i++) {
			int c;
			if (i < l) {
				c = (int)(s.charAt(i) - 'a') + 1;
			} else {
				c = 0;
			}
			node.n++;
			if (node.child[c] == null) {
				node.child[c] = new Node();
			}
			node = node.child[c];
		}
		node.n++;
	}

	public int order(String s, String p) {
		int a[] = new int[27];
		a[0] = 0;
		for (int i = 0; i < 26; i++) {
			a[i + 1] = (int)(p.charAt(i) - 'a') + 1;
		}

		int o = 0;
		Node node = root;
		int l = s.length();
		for (int i = 0; i < l; i++) {
			int c = (int)(s.charAt(i) - 'a') + 1;

			if (node.n != node.child[c].n) {
				for (int j = 0; a[j] != c; j++) {
					if (node.child[a[j]] != null) {
						o += node.child[a[j]].n;
					}
				}
			}
			node = node.child[c];
			if (node.n == 1) {
				break;
			}
		}
		return o + 1;
	}
}

class Node {
	public int n;
	public Node child[];

	public Node() {
		n = 0;
		child = new Node[27];
	}
}
