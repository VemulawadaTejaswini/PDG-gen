import java.util.Scanner;

public class Main {
	
	public static int N, A, B, C;
	public static int[] l;
	public static int INF = 32767;
	
	public static int dfs( int n, int a, int b, int c) {
		if( n == N ) {
			if( a > 0 && b > 0 && c > 0 ) {
				return Math.abs(a-A) + Math.abs(b-B) + Math.abs(c-C) - 30;
			}
			return INF;
		}
		int r = dfs( n+1, a, b, c );
		int ra = dfs( n+1, a+l[n], b, c ) + 10;
		int rb = dfs( n+1, a, b+l[n], c ) + 10;
		int rc = dfs( n+1, a, b, c+l[n] ) + 10;
		return Math.min(r, Math.min(ra, Math.min(rb, rc)));
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	N = sc.nextInt();
    	A = sc.nextInt();
    	B = sc.nextInt();
    	C = sc.nextInt();
    	l = new int[N];
    	for( int i = 0; i < N; i++  ) {
    		l[i] = sc.nextInt();
    	}
    	
    	System.out.println( dfs( 0, 0, 0, 0 ) );
    	
    	sc.close();
    }
}