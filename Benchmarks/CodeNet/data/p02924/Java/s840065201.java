import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();

		long sum = (long) (0.5*n*(n+1));

		System.out.println(sum-n);
		return;
	}
}
