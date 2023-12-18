import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class FenwickTree {
	    int n;
	    long x[];
	    public FenwickTree(int N) {
	    	this.n = N;
	    	x = new long[N + 1] ;
		}
	    int size()  { return n; }
	    long sum(int r) {
	        long S = 0;
	        for (r = r - 1; r >= 0; r = (r & (r + 1)) - 1) S += x[r];
	        return S;
	    }
	    long sum(int l, int r)  { return sum(r) - sum(l); }
	    void add(int k, long a) {
	        for (; k < n; k |= k + 1) {
	        	x[k] += a;
	        }
	    }
	    void set(int k, long a) { add(k, a - sum(k, k + 1)); }
	};
	static class Monster implements Comparable<Monster>{
		long X;
		long H;
		public Monster(long X , long H) {
			this.X = X;
			this.H = H;
		}
		@Override
		public int compareTo(Monster o) {
			return Long.compare(X, o.X);
		}
	}
	static int find(Monster ms[] , long X){
		int left = 0; 
		if(ms[left].X >= X){
			return 0;
		}
		int right = ms.length - 1; 
		while(right - left >= 2){
			int mid = (left + right) / 2;
			if(ms[mid].X >= X){
				right = mid;
			}else{
				left = mid;
			}
		}
		return right;
	}
	static long solveNaive(Monster ms[] , long D , long A){
		int N = ms.length;
		long ret = 0;
		FenwickTree fs = new FenwickTree(N + 1);
		for(int i = 0 ; i < N ; ++i){
			long bombRange = ms[i].X - 2 * D;
			int r = find(ms , bombRange);
			long prevBombNuum = fs.sum(r, i);
			long h = ms[i].H - prevBombNuum * A;
//			System.out.println(i+" "+prevBombNuum+" "+r+" "+ret+" "+bombRange+" "+h);
			if(h < 0){
				continue;
			}
			long bn = (h + A - 1) / A;
//			System.out.println(bn);
			ret += bn;
			fs.add(i, bn);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long D = sc.nextLong();
		long A = sc.nextLong();
		Monster ms[] = new Monster[N];
		for(int i = 0 ; i < N ; ++i){
			long x = sc.nextLong();
			long h = sc.nextLong();
			ms[i] = new Monster(x, h);
		}
		Arrays.sort(ms);
		System.out.println(solveNaive(ms, D, A));
	}
}
