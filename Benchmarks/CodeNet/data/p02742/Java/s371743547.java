import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		sc.close();

		if ( H % 2 == 0 ) {
			System.out.println(W * H / 2);
		} else {
			System.out.println(W * (H / 2) + (W + 1) / 2);
		}
	}
}
