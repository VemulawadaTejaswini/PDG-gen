
import java.util.*;

public class Main
{

    private final static int MOD = 1_000_000_007;

    public static int gcd(int a, int b) { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    }
    
    public static long mod(long a, long b) {
        return ((a % b) + b ) % b;
    }

    public static int mod (int a, int b) {
        return ((a % b) + b ) % b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int M = in.nextInt();
	int K = in.nextInt();
	in.nextLine();
	int[] A = new int[N], B = new int[M];
	for (int i = 0; i < N; i++) {
	    A[i] = in.nextInt();
	}
	in.nextLine();
	for (int i = 0; i < M; i++) B[i] = in.nextInt();
	mem = new int[K+1][N][M];
	for (int i = 0; i <= K; i++) {
	    for (int j = 0; j < N; j++) {
		Arrays.fill(mem[i][j], -1);
	    }
	}
	System.out.println(dfs(A,B, K, 0, 0));
	in.close();
    }

    static int[][][]mem;
    public static int dfs(int[] A, int[] B, int k, int ai, int bi) {
	if (k <= 0) return 0;
	else {
	    if (ai >= A.length) {
		int res = 0;
                if (bi < B.length && k >= B[bi]) {
                    res = Math.max(res, 1 + dfs(A,B,k-B[ai], ai, bi+1));
                }
		return res;
	    }
	    else if (bi >= B.length) {
		int res = 0;
                if (ai < A.length && k >= A[ai]) {
		    res = res + 1 + dfs(A,B, k - A[ai], ai+1, bi);
                }
		return res;		
	    }
	    else {
		if (mem[k][ai][bi] == -1) {
		    int res = 0;
		    if (ai < A.length && k >= A[ai]) {
			res = 1 + dfs(A,B, k - A[ai], ai+1, bi);
		    }
		    if (bi < B.length && k >= B[bi]) {
			res = Math.max(res, 1 + dfs(A,B,k-B[ai], ai, bi+1));
		    }
		    mem[k][ai][bi] = res;
		}
	    }
	    return mem[k][ai][bi];
	}
    }
			       
}
