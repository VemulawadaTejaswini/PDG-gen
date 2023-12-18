import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		int B = sc.nextInt();
		double T = sc.nextDouble();

		int a = (int) ((int)(T+0.5)/A);

		System.out.println(a*B);

	}
}
