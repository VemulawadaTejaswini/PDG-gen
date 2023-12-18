import java.util.Scanner;

public class Main {
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		int ans = 1000000007;
		int tmp;
		Integer x[] = new Integer[N];
		for (int i=0; i<N; i++) x[i] = sc.nextInt();
		for (int i=0; i<N-K+1; i++) {
			int a = Math.abs(x[i]) + Math.abs(x[i+K-1] - x[i]);
			// -2 -1 0 1 ▼正から行った方が早い
			int b = Math.abs(x[i+K-1]) + Math.abs(x[i+K-1] - x[i]);
			tmp = Math.min(a, b);
			ans = Math.min(ans, a);
		}
		System.out.println(ans);

	}
}