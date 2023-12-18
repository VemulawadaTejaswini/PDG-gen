import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long []a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long []b = new long[N + 1];
		for(int i = 1; i <= N; i++) {
			b[i] += b[i - 1] + a[i - 1];
		}
		int l = N * (N + 1) / 2;
		long []c = new long[l];
		int idx = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j <= N; j++) {
				c[idx] = b[j] - b[i];
				idx++;
			}
		}
		Arrays.sort(c);
		long ans = c[l - 1];
		for(int i = 0; i < K - 1; i++) {
			ans = ans & c[l - i - 2];
		}
		System.out.println(ans);
	}
}