import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}
		sc.close();
		DisjointSet ds = new DisjointSet(N);
		long[] ans = new long[M];
		ans[M - 1] = (long)N * (N - 1) / 2;
		for(int i = M - 1; i >= 1; i--) {
			if(!ds.same(A[i], B[i])) {
				ans[i - 1] = ans[i] - (long)ds.size(A[i]) * ds.size(B[i]);
				ds.unite(A[i], B[i]);
			}else {
				ans[i - 1] = ans[i];
			}
		}
		for(int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
	static class DisjointSet {
        int[] p;
        int[] rank;
        int[] size;
        DisjointSet(){}
        DisjointSet(int size){
            this.rank = new int[size];
            this.p = new int[size];
            this.size = new int[size];
            for(int i = 0; i < size; i++) {
                makeSet(i);
            }
        }
        void makeSet(int x) {
            p[x] = x;
            rank[x] = 0;
            size[x] = 1;
        }
        boolean same(int x, int y) {
            return findSet(x) == findSet(y);
        }
        void unite(int x, int y) {
            link(findSet(x), findSet(y));
        }
        void link(int x, int y) {
            if(rank[x]  > rank[y]) {
                p[y] = x;
                size[x] = size[x] + size[y];
            }else if(rank[x] < rank[y]){
                p[x] = y;
                size[y] = size[x] + size[y];
            }else if(x != y) {
            	p[y] = x;
            	rank[x]++;
            	size[x] = size[x] + size[y];
            }
        }
        int findSet(int x) {
            if(x != p[x]) {
                p[x] = findSet(p[x]);
            }
            return p[x];
        }
        int size(int x) {
        	if(x != p[x]) {
        		size[x] = size(findSet(x));
        	}
        	return size[x];
        }
    }
}