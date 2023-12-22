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
	static void solve(int A[] , int K){
		int N = A.length;
		FenwickTree ft = new FenwickTree(N);
		for(int i = 0 ; i < N ; ++i){
			int a = A[i];
			if(a == 0){
				continue;
			}
			ft.add(i,   a);
			ft.add(i + 1, - a);
		}
		for(int i = 0 ; i < K ; ++i){
			FenwickTree L = new FenwickTree(N);
			for(int j = 0 ; j < A.length ; ++j){
				int a = (int)ft.sum(0, j + 1);
				int l = j - a;
				int r = j + a;
				if(l < 0){
					l = 0;
				}
				if(r >= N){
					r = N - 1;
				}
				L.add(l, 1);
				L.add(r + 1, -1);
			}
			ft = L;
			boolean f = true;
			for(int j = 0 ; j < A.length ; ++j){
				int a = (int)ft.sum(0, j + 1);
				if(a != N){
					f = false;
					break;
				}
			}
			if(f){
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int j = 0 ; j < A.length ; ++j){
			if(sb.length() > 0){
				sb.append(' ');
			}
			int a = (int)ft.sum(0, j + 1);
			sb.append(a);
		}
		System.out.println(sb.toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		solve(A, K);
	}
}
