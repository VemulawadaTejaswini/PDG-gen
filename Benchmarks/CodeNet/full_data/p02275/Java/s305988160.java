import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int K = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			K = Math.max(K,  A[i]);
		}

		count(A, B, K);

		StringBuilder sb = new StringBuilder();
		sb.append(B[0]);
		for(int i = 1; i < n; i++) {
			sb.append(" ").append(B[i]);
		}
		System.out.println(sb);
	}

	public static void count(int[] a, int[] b, int k) {
		int[] C = new int[k + 1];
		for(int i = 0; i < a.length; i++) {
			C[a[i]]++;
		}
		for(int i = 1; i <= k; i++) {
			C[i] = C[i - 1] + C[i];
		}
		for(int i = a.length - 1; i >= 0; i--) {
			C[a[i]]--;
			b[C[a[i]]] = a[i];
 		}
	}

}

