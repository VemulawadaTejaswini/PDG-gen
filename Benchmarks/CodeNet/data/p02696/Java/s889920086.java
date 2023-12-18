import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long con = 1;
		long max = -1;

		while (con < B && con <= N) {
			long let = (A * con) / B;
			if (let > max) {
				max = let;
			}
			++con;
		}
		System.out.println(max);

	}
}