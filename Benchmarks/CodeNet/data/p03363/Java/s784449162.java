import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			long temp = A[i];
			for (int j = i + 1; j < N; j++) {
				temp += A[j];
				if (temp == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
