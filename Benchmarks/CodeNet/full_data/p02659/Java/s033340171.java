import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double A = sc.nextInt();
		double B = sc.nextInt();

		double multi = A * B;

		System.out.println(Math.floor(multi));

	}
}