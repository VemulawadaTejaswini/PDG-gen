import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		double x = L/3;
		double V = x*x*x;

		System.out.println(V);
	}
}
