import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		execute();
	}

	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			double ans = a / 1.08;

			if (ans % 1 == 0) {
				System.out.println((int)ans);
			} else {
				System.out.println(":(");
			}

		}
	}
}