import java.util.*;
class Main {
    static int[] w, v;
    static long[][] table;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int W = sc.nextInt();
	w = new int[N];
	v = new int[N];
	table = new long[N+1][W+1];

	for(int i = 0; i<N; i++) {
	    w[i] = sc.nextInt();
	    v[i] = sc.nextInt();
	}

	for(int i = 0; i < N+1; i++) {
	    for(int j = 0; j < W+1; j++) {
		table[i][j] = -1;
	    }
	}

	long total = getTotalValue(N, W);
	System.out.println(total);
    }

    public static long getTotalValue(int N, int W) {
	if(W<=0) {
	    return 0;
	}
	if(N<=0) {
	    return 0;
	}

	long v1,v2;
	if(table[N-1][W] != -1) {
	    v1 = table[N-1][W];
	}else {
	    v1 = getTotalValue(N-1,W);
	}

	if(W < w[N-1]) {
            return v1;
        }

	if(table[N-1][W-w[N-1]] != -1) {
	    v2 = table[N-1][W-w[N-1]];
	}else {
	    v2 = getTotalValue(N-1, W-w[N-1]);
	}

	return Math.max(v1, v2 + v[N-1]);
    }
}