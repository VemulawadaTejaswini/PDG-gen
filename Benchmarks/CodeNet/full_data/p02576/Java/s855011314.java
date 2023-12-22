import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int T = scanner.nextInt();
		int sum = N / X;
		if (N % X == 0) {
			System.out.println(sum*T);
		} else {
			System.out.println((sum+1)*T);
		}
	}
}