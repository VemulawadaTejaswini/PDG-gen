import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] H = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		for (int i = 0; i < N; i++) {
			if (i + 1 < N) {
				if (H[i] > H[i + 1]) {
					H[i]--;
				}
			}
		}

		int[] sorted = H.clone();
		Arrays.sort(sorted);

		boolean match = true;
		for (int i = 0; i < N; i++) {
			match = match && H[i] == sorted[i];
			if (!match)
				break;
		}
		System.out.println(match ? "Yes" : "No");
	}
}