import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		int[] B = new int[N];
		for(int i = 0; i < N + 1; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();
		int r = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				int a = i + j;
				int b = B[i] - A[a];
				if(b > 0) {
					r += B[i] - b;
					B[i] = b;
					A[a] = 0;
				} else {
					r += B[i];
					B[i] = 0;
					A[a] = b * -1;
				}
				// System.out.println(r + " " + Arrays.toString(A));
				// System.out.println("  " + Arrays.toString(B));
			}
		}
		System.out.println(r);
	}
}
