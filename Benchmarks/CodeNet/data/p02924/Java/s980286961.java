import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				sum += (i + 1) % 1;
			}
			else {
				sum += (i + 1) % (i + 2);
			}
		}
		System.out.println(sum);
	}
}