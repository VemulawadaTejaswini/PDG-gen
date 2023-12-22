import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		long ans = -a[N-1];
		for (int i = 0; i < N; i++) {
			ans += a[N - i / 2 - 1];
		}
		System.out.println(ans);
	}
}
