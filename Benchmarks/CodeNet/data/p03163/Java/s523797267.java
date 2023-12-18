import java.util.*;
class Main {
    static int[] w, v;
    static long[][] table;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int W = sc.nextInt();
	w = new int[N+1];
	v = new int[N+1];
	table = new long[N+1][W+1];

	for(int i = 1; i<N+1; i++) {
	    w[i] = sc.nextInt();
	    v[i] = sc.nextInt();
	}

	for(int i = 1; i <= N; i++) {
	    for(int j = 0; j <= W; j++) {
		if(j < w[i]) {
		    table[i][j] = table[i-1][j];
		} else {
		    table[i][j] = Math.max(table[i-1][j], table[i-1][j-w[i]] + v[i]);
		}
	    }
	}

	long total = table[N][W];
	System.out.println(total);
    }
}