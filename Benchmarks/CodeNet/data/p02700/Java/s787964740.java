import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		int c = stdIn.nextInt();
		int d = stdIn.nextInt();

		int takahashiTurn = (int) Math.ceil(1.0 * c / b);
		int aokiTurn = (int) Math.ceil(1.0 * a / d);

		if(takahashiTurn > aokiTurn) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		stdIn.close();
	}
}