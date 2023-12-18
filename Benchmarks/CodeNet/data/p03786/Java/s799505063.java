import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long a[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long sum[] = new long[N + 1];
		for (int i = 0; i < N; i++) {
			sum[i + 1] = sum[i] + a[i];
		}
		
		for (int i = N - 1; i >= 0; i--) {
			if (a[i] > 2 * sum[ i ]) {
				System.out.println(N - i);
				return;
			}
		}
		System.out.println(N);
	}
}