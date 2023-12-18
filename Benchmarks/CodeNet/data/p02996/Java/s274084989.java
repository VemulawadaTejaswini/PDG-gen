import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double concat[] = new double[N];

		for (int i = 0; i < N; i ++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			concat[i] = B + 0.1 * A;
		}

		Arrays.sort(concat);

		boolean possible = true;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Integer.valueOf(String.valueOf(concat[i]).split("\\.")[1]);
			if (Integer.valueOf(String.valueOf(concat[i]).split("\\.")[0]) < sum) {
				possible = false;
				break;
			}
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}