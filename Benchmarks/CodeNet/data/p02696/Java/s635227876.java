import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long let;
		if (B <= N) {
			let = (A * (B - 1)) / B;
		} else {
			let = (A * N) / B;
		}
		System.out.println(let);

	}
}