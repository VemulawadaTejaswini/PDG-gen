import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		int pass_time = H*60 + M;
		double digA = (0.5 * (double)pass_time) % 360;
		double digB = (6 * pass_time) % 360;

		double C = Math.sqrt(A*A + B*B -2*A*B*Math.cos(Math.toRadians(Math.abs(digA-digB))));

		System.out.println(C);

	}
}
