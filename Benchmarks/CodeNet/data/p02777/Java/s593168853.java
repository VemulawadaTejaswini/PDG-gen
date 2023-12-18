import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String colorA = sc.next();
		String colorB = sc.next();
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		String colorC = sc.next();

		if (colorC == colorA) {
			numA--;
		} else if (colorC == colorB) {
			numB--;
		}

		System.out.println(numA + " " + numB);

	}
}