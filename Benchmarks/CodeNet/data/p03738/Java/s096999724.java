import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		int ans = Long.compare(A, B);
		System.out.println(ans >= 0 ? ans == 0?"EQUAL":"GREATER":"LESS");
	}
}