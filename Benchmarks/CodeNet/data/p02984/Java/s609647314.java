import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		long k = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) k += A[N - i - 1];
			else k -= A[N - i - 1];
		}
		k /= 2;
		long X = k;
		System.out.print(2 * X);
		for(int i = 1; i < N; i++) {
			X = A[i - 1] - X;
			System.out.print(" " + 2 * X);
		}
	}
}
