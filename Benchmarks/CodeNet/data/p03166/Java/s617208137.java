import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[][] G;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
        G = new int[N+1][N+1];
        HashSet<Integer> hs = new HashSet<>();

	    for(int m=1; m<=M; ++m) {
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        G[x][y] = 1;
            hs.add(x);
        }

	    int r = 0;
	    for(int beg: hs) {
            int t = longest(G, beg);
            r = Math.max(t, r);
        }
//	    for(int i=1; i<=N; ++i) {
//	        int t = 0;
//            t = longest(G, 1);
//            r = Math.max(r, t);
//        }

	    System.out.println(r);
    }

    public static int longest(int[][] G, int begI) {
        int r = 0;
        for(int j=1; j<=N; ++j) {
            int t = 0;
            if(G[begI][j]>0) {
                t = 1 + longest(G, j);
            }
            r = Math.max(r, t);
        }

        return r;
    }

    public static void d0(int[][] dp) {
        System.out.print("    ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%3d ", j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i) {
            System.out.printf("%3d|", i);
            for(int j=0; j<dp[0].length; ++j) {
                System.out.printf("%3d ", dp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
