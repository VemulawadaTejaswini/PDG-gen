import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		int cnt = h[0];
		for (int i = 1; i < N; i++) {
			cnt += Math.max(h[i] - h[i - 1], 0);
		}

		System.out.println(cnt);
	}
}
