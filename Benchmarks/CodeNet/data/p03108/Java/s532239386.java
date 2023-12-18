import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int M = Integer.parseInt(sc.next());
	int[] a = new int[M];
	int[] b = new int[M];
	long[] ans = new long[M];

	for(int i = 0; i<M; i++) {
	    a[i] = Integer.parseInt(sc.next());
	    b[i] = Integer.parseInt(sc.next());
	}

	UnionFind uf = new UnionFind(N);
	for(int i = M-1; i >=0; i--) {
	    if(i == M-1) {
		ans[i] = N*(N-1)/2;
		continue;
	    }
	    if(uf.root(a[i+1]) != uf.root(b[i+1])) {
		ans[i] = ans[i+1] - (long)uf.size(a[i+1])*(long)uf.size(b[i+1]);

	    } else {
		ans[i] = ans[i+1];
	    }
	    uf.connect(a[i+1],b[i+1]);
	}
	for(int i = 0; i<M; i++) {
	    System.out.println(ans[i]);
	}
    }
}
class UnionFind {
    int[] parent;
    UnionFind(int n) {
	parent = new int[n+1];
	for(int i = 0; i<=n; i++) {
	    parent[i] = -1;
	}
    }

    int root(int A) {
	if(parent[A]<0) return A;
	parent[A] = root(parent[A]);
	return parent[A];
    }

    boolean connect(int A, int B) {
	A = root(A);
	B = root(B);
	if(A == B) {
	    return false;
	}
	if(size(A) < size(B)) {
	    int tmp = B;
	    B = A;
	    A = tmp;
	}
	parent[A] += parent[B];
	parent[B] = A;
	return true;
    }

    int size(int A) {
	return -1*parent[root(A)];
    }
}