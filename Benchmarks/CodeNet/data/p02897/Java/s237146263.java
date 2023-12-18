import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		double result = Math.ceil(n / 2.0) / n;
		System.out.println(result);
	}
}
