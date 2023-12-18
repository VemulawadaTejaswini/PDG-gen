import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		long[] h = new long[N];
		for (int i = 0; i < h.length; i++) {
			h[i] = in.nextLong();
		}
		Arrays.sort(h);
		long ans = Long.MAX_VALUE;
		for (int i = 0; i < h.length - K + 1; i++) {
			ans = Math.min(ans, h[i + K - 1] - h[i]);
		}
		System.out.println(ans);
		in.close();
	}
}