import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();

		for (int i = (X - K + 1); i < (X + K); i++) {
			System.out.print(i + " ");
		}
	}
}
