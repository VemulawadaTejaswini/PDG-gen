import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		long[] h = new long[n];
		long ans = 0;
		for (int i = 0; i < n; i++) h[i] = sc.nextLong();
		Arrays.parallelSort(h);
		for (int i = 0; i < n-k; i++) ans += h[i];
		System.out.println(ans);
	}
}