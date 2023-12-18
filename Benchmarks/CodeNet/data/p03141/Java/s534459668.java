import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		sc.close();
		long[] c = new long[N];
		long b = 0;
		for(int i = 0; i < N; i++) {
			c[i] = A[i] + B[i];
			b += B[i];
		}
		Arrays.sort(c);
		long k = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				k += c[i];
			}
		}
		k -= b;
		System.out.println(k);
	}
}