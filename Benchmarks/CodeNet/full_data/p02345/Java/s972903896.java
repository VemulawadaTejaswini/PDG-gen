import java.util.Scanner;
import java.util.ArrayList;

class RMQ {
	ArrayList<Integer> node;
	int defval;
	int N;
	int n;

	public int func(int a, int b) {
		return Math.min(a, b);
	}
	public void init(int n, int defval) {
		node = new ArrayList<>();
		N = 1;
		while (N < n)N *= 2;
		this.n = n;
		this.defval = defval;
		for (int i = 0; i < N * 2 - 1; i++)
			node.add(defval);
	}
	public int query(int a, int b, int l, int r, int i) {
		if (r == -1) r = N;
		if (b <= l || r <= a) return defval;
		if (a <= l && r <= b) return node.get(i);
		return func(query(a, b, l, (l + r) / 2, i * 2 + 1), query(a, b, (l + r) / 2, r, i * 2 + 2));
	}
	public void update(int p, int v) {
		int q = p + N - 1;
		node.set(q, v);
		while (q != 0) {
			q = (q - 1) / 2;
			node.set(q, func(node.get(q * 2 + 1), node.get(q * 2 + 2)));
		}
	}
	public int get(int p) { return node.get(p + N - 1); }
};


public class Main{
	public static void main(String[] args){
		RMQ t; t = new RMQ();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		ArrayList<Integer> ans = new ArrayList<>();
		t.init(n, 0x7fffffff);
		for(int i = 0; i < q; i ++){
			int c = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			if (c == 0) {
				t.update(x, y);
			}
			 else {
				ans.add(t.query(x, y + 1, 0, -1, 0));
			}
		}
		for (int i = 0; i < ans.size(); i++)
		    System.out.println(ans.get(i));
	}
}

