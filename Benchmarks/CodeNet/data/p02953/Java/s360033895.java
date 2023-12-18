import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] H = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		boolean match = true;
		for (int i = 0; i < N; i++) {
			if (i + 1 < N) {
				if (H[i] > H[i + 1]) {
					H[i]--;
				}

				if (i - 1 > 0) {
					match = match && H[i - 1] <= H[i] && H[i] <= H[i + 1];
				} else {
					match = match && H[i] <= H[i + 1];
				}
			}
			if (!match)
				break;
		}
		System.out.println(match ? "Yes" : "No");
	}
}
