import java.util.BitSet;

public class Main {
	static BitSet[] tree;
	public static void main(String[] args) {
		int N = NI();
		int Q = NI();
		int[] c = new int[N];
		for (int i = 0; i < N; i++) {
			c[i] = NI();
		}
		int n = Integer.highestOneBit(N) << 1;
		tree = new BitSet[2 * n];
		for (int i = 0; i < tree.length; i++)
			tree[i] = new BitSet();
		for (int i = n - 1; i < n - 1 + N; i++) {
			tree[i].set(c[i - (n - 1)]);
			for (int j = i; j > 0;) {
				j = (j - 1) >> 1;
				tree[j].or(tree[j * 2 + 1]);
				tree[j].or(tree[j * 2 + 2]);
			}
		}
		for (int i = 0; i < Q; i++) {
			int l = NI() - 1;
			int r = NI();
			BitSet set = new BitSet();
			query(l, r, 0, 0, n, set);
			System.out.println(set.cardinality());
		}
	}
	static void query(int x, int y, int k, int l, int r, BitSet set) {
		if (r <= x || y <= l) return;
		if (x <= l && r <= y) {
			set.or(tree[k]);
			return;
		}
		query(x, y, k * 2 + 1, l, (l + r) / 2, set);
		query(x, y, k * 2 + 2, (l + r) / 2, r, set);
	}
	
	static int NI(){
		try {
			int c=System.in.read(),r=0;
			for(;c!='-'&&(c<'0'||'9'<c);)c=System.in.read();
			if(c=='-') return -NI();
			for(;'0'<=c&&c<='9';c=System.in.read())
				r = r * 10 + c - '0';
			return r;
		} catch (Exception e) {
			return -1;
		}
	}
}
