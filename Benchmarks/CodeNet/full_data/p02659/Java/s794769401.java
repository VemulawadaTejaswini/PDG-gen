import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();
		double B = scanner.nextDouble();
		long AB = (long)(A * B);
		System.out.println(AB);
	}
}
