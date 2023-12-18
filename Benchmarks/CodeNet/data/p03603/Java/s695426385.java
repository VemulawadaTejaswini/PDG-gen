import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 1) {
			int kara = Integer.parseInt(sc.next());
			System.out.println("POSSIBLE");
		} else {
			int[] p = new int[n];
			p[0] = 0;
			for (int i = 0; i < n - 1; i++) {
				p[i + 1] = Integer.parseInt(sc.next());
			}
			int[] x = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = Integer.parseInt(sc.next());
			}
			int[][] dp = new int[2][n];
			Deque<node> node = new ArrayDeque<>();
			node.addFirst(new node(n - 1, x[n - 1], 0));
			node tmps;
			int tmpp = n - 1;
			int sumw, sumb;
			int next;
			boolean flg = false;
			boolean addflg = false;
			while (!node.isEmpty()) {
				tmps = node.removeFirst();
			//	System.out.println(tmps.id + "," + tmps.white + "," + tmps.black);
				if (tmps.id == 0) {
					flg = true;
					break;
				}
				dp[0][tmps.id] = tmps.white;
				dp[1][tmps.id] = tmps.black;
				if (addflg == false) {
					tmpp = nibun(p, tmps.id);
				}
				addflg = false;
				//	System.out.println("tmpp " + tmpp);
				sumw = 0;
				sumb = 0;
				while (p[tmpp] == tmps.id) {
					sumw += dp[0][tmpp];
					sumb += dp[1][tmpp];
					tmpp--;
				}
				next = x[tmps.id - 1];
				if (sumw <= next) {
					node.addFirst(new node(tmps.id - 1, next, sumb));
					addflg = true;
			//		System.out.println("add " + (tmps.id - 1) + "," + next + "," + sumb + ",white");
				}
				if (sumb <= next) {
					node.addFirst(new node(tmps.id - 1, sumw, next));
					addflg = true;
			//		System.out.println("add " + (tmps.id - 1) + "," + sumw + "," + next + ",black");
				}
			}
			if (flg == true) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}

	static int nibun(int[] p, int n) {
		int cen;
		int l = 0;
		int r = p.length - 1;
		while (l != r) {
			cen = (l + r + 1) / 2;
			if (p[cen] > n) {
				r = cen - 1;
			} else {
				l = cen;
			}
		}
		return l;
	}
}

class node {
	int id;
	int white;
	int black;

	node(int id, int white, int black) {
		this.id = id;
		this.white = white;
		this.black = black;
	}
}