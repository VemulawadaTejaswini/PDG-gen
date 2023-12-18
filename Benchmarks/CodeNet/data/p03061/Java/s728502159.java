import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		int[] L = new int[N + 1];
		int[] R = new int[N + 1];
		L[0] = A[1];
		R[0] = A[N];
		
		for(int i = 1; i <= N; i++) {
			L[i] = gcd(L[i - 1], A[i]);
			R[i] = gcd(R[i - 1], A[N - i + 1]);
		}
		
		int max = 0;
		L[0] = A[2];
		R[0] = A[N - 1];
		
		for(int i = 0; i <= N - 1; i++) {
			max = Math.max(gcd(L[i], R[N - i - 1]), max);
		}
		System.out.println(max);
	}
	
	public static int gcd(int a, int b) {
		int c = 0;
		if(b == 0) {
			return a;
		}
		if(b > a) {
			c = a;
			a = b;
			b = c;
		}
		return gcd(b, a % b);
	}
	
}
