
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b)
			System.out.println("Draw");
		else if (a == 1 || (a > b && b != 1))
			System.out.println("Alice");
		else
			System.out.println("Bob");
		sc.close();
	}
}