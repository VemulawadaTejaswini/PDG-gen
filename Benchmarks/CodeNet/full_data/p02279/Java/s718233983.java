import java.util.*;
import java.io.*;

public class Main {
	static class Node {
		int id = -1;
		Node p = NIL;
		Node lc = NIL;
		Node rs = NIL;
		int depth = -1;
	}
	static Node NIL = new Node();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		Node[] tree = new Node[n];
		for (int i = 0; i < n; i ++) {
			tree[i] = new Node();
		}

		for (int i = 0; i < n; i ++) {
			int id = scanner.nextInt();
			Node u = tree[id];
			u.id = id;
			
			int k = scanner.nextInt();
			if (k == 0) continue;
			
			Node v =  tree[scanner.nextInt()];
			u.lc = v;
			v.p = u;
			for (int j = 1; j < k; j ++) {
				Node w = tree[scanner.nextInt()];
				v.rs = w;
				w.p = u;
				v = w;
			}
		}

		scanner.close();
		
		for (Node u: tree) {
			System.out.print("node ");
			System.out.print(u.id);
			System.out.print(": parent = ");
			System.out.print(u.p.id);
			System.out.print(", depth = ");
			System.out.print(getDepth(u));
			System.out.print(", ");
			System.out.print((u.p == NIL) ? "root": ((u.lc != NIL) ? "internal node": "leaf"));
			System.out.print(", [");
			printChildren(u);
			System.out.println("]");
		}
	}
	
	static int getDepth(Node u) {
		u.depth = (u.p != NIL) ? ((u.p.depth != - 1) ? u.p.depth + 1: getDepth(u.p) + 1): 0;
		return u.depth;
	}
	
	static void printChildren(Node u) {
		if (u.lc == NIL) return;
		
		System.out.print(u.lc.id);
		for (Node v = u.lc.rs; v != NIL; v = v.rs) {
			System.out.print(", " + v.id);
		}
	}
} 

