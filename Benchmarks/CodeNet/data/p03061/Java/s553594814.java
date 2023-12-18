import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		int[] L = new int[N+1];
		int[] R = new int[N+1];
		L[0] = 0;
		R[N] = 0;
		for(int i = 0;i < N;i++) {
			L[i+1] = gcd(L[i],A[i]);
		}
		for(int i = N-1;i > 0;i--) {
			R[i] = gcd(R[i+1],A[i]);
		}
		int[] M = new int[N];
		int result = 0;
		for(int i = 0;i < N;i++) {
			M[i] = gcd(L[i],R[i+1]);
			result = Math.max(result, M[i]);
		}
		System.out.println(result);
	}

	private static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else if(a == 0) {
			return b;
		}
		return gcd(b,a%b);
	}
}