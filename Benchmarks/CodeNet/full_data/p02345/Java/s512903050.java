import java.util.*;

class Main {

	static int MAX_N = 1 << 17;
	static int INT_MAX = 2147483647;

	static int n;
	static int[] dat = new int[2*MAX_N-1];
	// static int[] dat = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		init(N);
		for (int i=0;i<q;i++) {
			int c = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			if (c==0) {
				update(x, y);
			} else {
				System.out.println(query(x, y+1, 0, 0, n));
			}
		}
		// System.out.println(dat.length);
		// System.out.println(Arrays.toString(dat));
	}

	public static void init(int n_) {
		n = 1;
		while (n < n_) {
			n*=2;
		}
		for (int i=0;i<2*n-1;i++) {
			dat[i] = INT_MAX;
		}
	}

	public static void update(int k, int a) {
		k+=n-1;
		dat[k]=a;
		while (k>0) {
			k = (k-1)/2;
			dat[k] = Math.min(dat[k*2+1], dat[k*2+2]);
		}
	}

	public static int query(int a, int b, int k, int l, int r) {
		if (r<=a || b<=l) {
			return INT_MAX;
		}
		if (a<=l && r<=b) {
			return dat[k];
		} else {
			int vl = query(a, b, k*2+1, l, (l+r)/2);
			int vr = query(a, b, k*2+2, (l+r)/2, r);
			return Math.min(vl, vr);
		}
	}
}
