import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int P = sc.nextInt();

		int X = A * 3 + P;

		System.out.print(X / 2);

	}
}