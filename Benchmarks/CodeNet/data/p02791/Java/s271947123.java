import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		int min[] = new int[N];
		Arrays.fill(min, Integer.MAX_VALUE);
		int answer = 0;

		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
			if (0 < i) min[i-1] = Math.min(P[i], P[i-1]);
		}

		for (int i = 0; i < N; i++) {
			if (P[i] <= min[i]) answer++;
		}

		System.out.println(answer);
	}
}