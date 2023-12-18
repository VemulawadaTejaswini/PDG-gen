import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		if (A >= K) System.out.println(K);
		else if (A + B >= K) System.out.println(A);
		else System.out.println(A - (K - A - B));
	}
}