import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String message = "YES";
		if((a % 2 == 0) && (b % 2 == 0) && (c % 2) == 1) {
			message = "NO";
		} else if ((a % 2 == 1) && (b % 2 == 0) && (c % 2 == 0)) {
			message = "NO";
		}
		System.out.println(message);
	}
}