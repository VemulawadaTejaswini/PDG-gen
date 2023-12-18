import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();

		int count = 0;
		for (int i = 1; i <= N; i += 2) {
			count++;
			if (count == K) {
				System.out.print("YES");
				return;
			}
		}

		System.out.print("NO");
	}
}