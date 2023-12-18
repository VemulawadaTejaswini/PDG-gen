import java.util.Scanner;

/**
 * https://abc058.contest.atcoder.jp/tasks/arc071_b
 */
public class Main {

	static final int MOD = 1000000007;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[M];
		for(int i=0; i<N; i++) x[i] = Long.parseLong(sc.next());
		for(int i=0; i<M; i++) y[i] = Long.parseLong(sc.next());
		sc.close();
		
		
		long xsum = 0;
		long ysum = 0;
		for(int i=0; i<N; i++){
			xsum = ( xsum - ((long)N-2*(long)i-1)*x[i]%MOD ) %MOD;
		}
		for(int i=0; i<M; i++){
			ysum = ( ysum - ((long)M-2*(long)i-1)*y[i]%MOD ) %MOD;
		}
		
	
		System.out.println(xsum*ysum%MOD);

	}

}