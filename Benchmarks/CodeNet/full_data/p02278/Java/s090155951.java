import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	final static int vmax = 10000;
	final static int max = 1000;
	
	int n, s;
	int[] w;
	
	int[] B = new int[max];
	int[] T = new int[vmax+1];
	
	//入力
	public void input() {
		n = sc.nextInt();
		w = new int[n];
		s = vmax;
		for(int i=0; i<n; i++) {
			w[i] = sc.nextInt();
			s = Math.min(s, w[i]);
		}
	}
	
	//出力
	public void conan() {
		int ans = solve();
		System.out.println( ans );
	}
	
	//解を求める
	public int solve() {
		int ans = 0;
		boolean[] V = new boolean[n];
		for(int i=0; i<n; i++) {
			B[i] = w[i];
			V[i] = false;
		}
		//配列Bをソートする
		//開始と終了のインデックスを指定する
		Arrays.sort(B,0,n);
		
		for(int i=0; i<n; i++) { T[ B[i] ] = i; }
		
		for(int i=0; i<n; i++) {
			if( V[i] ) continue;
			int cur = i;
			int S = 0;
			int m = vmax;
			int an = 0;
			while( true ) {
				V[cur] = true;
				an++;
				int v = w[cur];
				m = Math.min(m, v);
				S += v;
				cur = T[v];
				if( V[cur] ) break;
			}
			ans += Math.min( S+(an-2)*m, m+S+(an+1)*s );
		}
		return ans;
	}
	
	public static void main(String[] args) {
	    Main obj = new Main();
		obj.input();
		obj.conan();
	}
}

