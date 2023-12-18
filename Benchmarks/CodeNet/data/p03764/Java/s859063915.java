import java.util.*;

public class Main {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] x = new int[N];
		for(int i=0; i<N; i++)
			x[i] = sc.nextInt();
		int[] y = new int[M];
		for(int i=0; i<M; i++)
			y[i] = sc.nextInt();
		
		System.out.println((calc(x)*calc(y))%MOD);
		
		sc.close();
	}
	
	static long calc(int[] p) {
		int N = p.length;
		long ans = 0;
		for(int i=0; i<N-1; i++) {
			long mul = ((long)(i+1)*(N-1-i))%MOD;
			ans = (ans + mul*(p[i+1]-p[i]))%MOD;
		}
		return ans;
	}
}
