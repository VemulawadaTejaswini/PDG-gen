import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int d = scan.nextInt();
		int n = scan.nextInt();
		System.out.println((int)Math.pow(100, d) * n);
	}
}
