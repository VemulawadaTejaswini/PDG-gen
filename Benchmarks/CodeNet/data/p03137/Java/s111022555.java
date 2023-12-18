import java.util.*;
public class Main {
	static int N;
	static int M;
	static int[] X;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		X = new int[M];
		for(int i=0;i<M;i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		int ret = calc(N-1,1,0);
		System.out.println(ret);
	}
	
	// start以降に対し、n斯の駒
	public static int calc(int n, int now, int prev) {
		if (n > M-1-now) return 0;
		if (now == M) return 0;
		if (n==0) return (X[M-1]-X[prev]);
		return Math.min(calc(n-1,now+1,now), X[now]-X[prev]+calc(n,now+1,now));
	}
}
