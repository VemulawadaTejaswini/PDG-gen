import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.nextLine());
			int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(r -> Integer.parseInt(r)).toArray();
			long ans = 0;
			for (int i = 0; i < N; i++) {
				if (i != N - 1) {
					if (A[i] < 0) {
						A[i] = A[i] * (-1);
						A[i + 1] = A[i + 1] * (-1);
					}
				}
				ans += A[i];
			}
			System.out.println(ans);
		}
	}
}