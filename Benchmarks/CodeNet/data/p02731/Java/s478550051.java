import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		sc.close();

		double result = l * l * l / 27.0;
		System.out.println(String.format("%.9f", result));
	}
}
