import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			W[i] = sc.nextInt();
			sum += W[i];
		}
		sc.close();

		int now = 0;
		int prev = 0;
		for (int i = 0; i < N; i++) {
			now += W[i];

			if (now >= sum / 2) {
				prev = now - W[i];
				break;
			}
		}

		System.out.println(Math.min(Math.abs(sum - now * 2), Math.abs(sum - prev * 2)));
	}
}
