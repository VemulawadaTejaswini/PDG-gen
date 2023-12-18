import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		double ans = N / (A+B) * A;
		int rem =  N % (A + B);
		ans += Math.min(rem, A);
		System.out.println((int)ans);

	}
}
