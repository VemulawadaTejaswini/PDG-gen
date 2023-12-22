import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		double b = scan.nextDouble() * 100;

		System.out.println(((a * b)/100));
	}
}
