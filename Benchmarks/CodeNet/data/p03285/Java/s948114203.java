import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i <= N; i += 4) {
			for (int j = 0; j <= N; j += 7) {
				if (N == i + j) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
