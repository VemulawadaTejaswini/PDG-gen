import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, A;
		X = sc.nextInt();
		A = sc.nextInt();

		if (X < A) {
			System.out.println("0");
		} else if (A <= X) {
			System.out.println("10");
		}
	}
}