import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A1 = input.nextInt();
		int A2 = input.nextInt();
		int A3 = input.nextInt();

		int cost = 0;
		cost = A1 > A2 ? A1 - A2 : A3 - A1;
		cost += A2 - A3;
		System.out.println(cost);
		input.close();
	}
}
