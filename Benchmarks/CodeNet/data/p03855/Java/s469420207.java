
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int N ;
    private static int K;
    private static int L;

    public static void main(String[] args) {
	N = Integer.parseInt(scan.next());
	K = Integer.parseInt(scan.next());
	L = Integer.parseInt(scan.next());

	UnionFind k = new UnionFind(N);
	UnionFind l = new UnionFind(N);
	
	for (int i = 0; i < K; i++) {
	    int p = Integer.parseInt(scan.next()) - 1;
	    int q = Integer.parseInt(scan.next()) - 1;
	    k.connect(p, q);
	}
	for (int i = 0; i < L; i++) {
	    int r = Integer.parseInt(scan.next()) - 1;
	    int s = Integer.parseInt(scan.next()) - 1;
	    if(k.root(r) == k.root(s)) l.connect(r, s);
	}

	for (int i = 0; i < N; i++) {
	    if(i > 0) System.out.print(' ');
	    System.out.print(l.size(i));
	}
	scan.close();
    }

    private static class UnionFind {
	int[] uni;

	public UnionFind(int N) {
	    uni = new int[N];
	    for (int i = 0; i < N; i++) {
		uni[i] = -1;
	    }
	}

	public int root(int a) {
	    if(uni[a] < 0) return a;
	    else return uni[a] = root(uni[a]);
	}

	public boolean connect(int a, int b) {
	    a = root(a);
	    b = root(b);

	    if(a == b) return false;
	    if(uni[a] > uni[b]) {
		int tmp = a;
		a = b;
		b = tmp;
	    }
	    uni[a] += uni[b];
	    uni[b] = a;
	    return true;
	}

	public int size(int a) {
	    return -uni[root(a)];
	}
    }
}
