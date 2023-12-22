import java.util.*;

public class Main {
	// from: "プログラミングコンテストチャレンジブック[第2版]"(http://amzn.asia/3MkgFHb) p155
	// Random minimum Query implementation by segment tree.
	/*
	 * メモ
	 * 親ノードへのアクセス (n-1)/2
	 * 子ノードへのアクセス 2*n+1, 2*n+2
	 * もとの配列のインデックスiからセグメント木へのインデックスn+i-1
	 */ 
	static long INITIAL_VALUE = (1<<31)-1;
	static int n; // number of elements
	static int MAX_N = 100000*2-1;
	static long[] dat = new long[MAX_N];
	
	static void init() {
		Arrays.fill(dat, INITIAL_VALUE);
	}
	
	// int[]aで初期化したいとき
	static void init(int[] a) {
		assert a.length == n;
		init();
		for(int i=0; i<n; i++) {
			update(i, a[i]);
		}
	}
	
	// k番目の値をaに変更
	static void update(int k, int a) {
		k += n-1;
		dat[k] = a;
		while(k>0) {
			k = (k-1)/2;
			dat[k] = Math.min(dat[k*2+1], dat[k*2+2]);
		}
	}
	
	// minimum query [s, t)
	static long find(int s, int t) {
		return find(s, t, 0, 0, n);
	}
	
	// kは注目している節点の番号、l, rはその接点が[l, r)に対応づいていることを表す
	static long find(int a, int b, int k, int l, int r) {
		// [a, b) と[l, r)が交差しないとき
		if(r<=a || b <= l) return INITIAL_VALUE;
		if(a<=l && r <= b) return dat[k];
		else {
			long vl = find(a, b, k*2+1, l, (l+r)/2);
			long vr = find(a, b, k*2+2, (l+r)/2, r);
			return Math.min(vl, vr);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmpn = sc.nextInt(); int q  = sc.nextInt();
		ArrayList<Long> ans = new ArrayList<>();
		n=1;
		while(n<tmpn) {
			n *= 2;
		}
		init();
		for(int i=0; i<q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(com==0) {
				update(x, y);
			} else {
				ans.add(find(x, y+1, 0, 0, n));
			}
		}
		for(int i=0; i<ans.size(); i++) System.out.println(ans.get(i));
	}
	
}

