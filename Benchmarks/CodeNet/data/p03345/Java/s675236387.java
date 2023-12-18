import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long l = 1000000000 * 1000000000;
		if (Math.abs(A - B) > l) {
			System.out.println("Unfair");
		} else {
			System.out.println(A - B);
		}
	}
}