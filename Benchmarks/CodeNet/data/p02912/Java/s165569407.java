import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int y = 0;

		long A[] = new long[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int price = 0;
		Arrays.sort(A);
		for (int i = n - 1;  m > 0; ) {
			y = 1;
			A[i] = (int) (A[i] / (Math.pow(2, y)));
			m --;
			Arrays.sort(A);
		}
		long sum = 0;
		for (int i = n - 1; i >= 0 ; i--) {
			sum += A[i];
		}
		System.out.println(sum);
	}
}