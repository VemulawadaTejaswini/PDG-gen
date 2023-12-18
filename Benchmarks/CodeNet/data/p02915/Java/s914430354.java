import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();

			int ans = N;
			for (int i = 0; i < N;i++) ans *= N;

			System.out.println(ans);
		}

	}
}
