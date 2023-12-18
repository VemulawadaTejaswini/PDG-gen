import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		solve(a, b);
	}

	static void solve(int a, int b) {

		String[] arr = new String[16];

		try {
			for (int i = 0; i < a; i++) {
				arr[i * 2] = "e";
			}

			for (int i = 1; i < b; i++) {
				arr[(i * 2) - 1] = "s";
			}
			System.out.println("Yay!");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(":(");
		}
	}
}