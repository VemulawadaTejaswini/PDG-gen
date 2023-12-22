import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A, B, H, M;

		A = Integer.parseInt(in.next());
		B = Integer.parseInt(in.next());
		H = Integer.parseInt(in.next());
		M = Integer.parseInt(in.next());
		double pi = Math.PI;

		double alpha = 2 * pi * H / 12 + 2 * pi * M / 720;
		double beta = 2 * pi * M / 60;

		double ans = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2) - 2 * A * B * Math.cos(alpha - beta));
		System.out.println(ans);
	}
}
