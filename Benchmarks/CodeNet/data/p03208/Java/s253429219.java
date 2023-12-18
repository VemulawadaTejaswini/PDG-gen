import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), K = in.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = in.nextInt();
		}
		Arrays.sort(h);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= N - K; i++) {
			ans = Math.min(ans, h[i + K - 1] - h[i]);
		}
		System.out.println(ans);
	}
}
