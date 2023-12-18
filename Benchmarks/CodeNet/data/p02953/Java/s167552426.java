import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] H = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		int pre = -1;
		for (int i = 0; i < N; i++) {
			if (pre <= H[i] - 1) {
				pre = H[i] - 1;
			} else if (pre <= H[i]) {
				pre = H[i];
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}