import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] s = new int[N];
			int sum = 0;
			for (int i = 0; i < N; ++i) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			Arrays.sort(s);
			sum -= s[0] + s[N - 1];
			System.out.println(sum / (N - 2));
		}
	}
}