import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] X = new int[N];
		for (int i=0; i<N; i++) X[i] = sc.nextInt();
		System.out.println(solve(0, 1, A, X, 0));
		sc.close();
	}
	
	
	private static long solve(int n, int m, int A, int[] X, int sum) {
		if (n>=X.length) return 0;
		long cnt = solve(n+1, m, A, X, sum) + solve(n+1, m+1, A, X, X[n]+sum);
		if ((X[n]+sum)==m*A) cnt++;
		return cnt;
	}

}
