import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] A = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int[] l = new int[N];

		for (int i = 0; i < N; i++) {
			l[i] = B[(N + i - 1) % N] + B[(i + 1) % N];
		}

		int ans = 0;
		boolean f = true;
		while (f) {
			f = false;
			for (int i = 0; i < N; i++) {
				if (A[i] <= B[i] - l[i]) {
					f = true;
					ans++;
					B[i] -= l[i];
					l[(N + i - 1) % N] -= l[i];
					l[(i + 1) % N] -= l[i];
				}
			}
		}

		if (Arrays.equals(A, B))
			System.out.println(ans);
		else
			System.out.println(-1);

		scanner.close();
	}
}
