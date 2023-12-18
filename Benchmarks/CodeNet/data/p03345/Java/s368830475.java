
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		String s = "1000000000000000000";
		if (String.valueOf(Math.abs(A - B)).length() > s.length()) {
			System.out.println("Unfair");
		} else {
			System.out.println(A - B);
		}
	}
}