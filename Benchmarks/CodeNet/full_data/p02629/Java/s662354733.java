import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		StringBuilder sb = new StringBuilder();
		while (n > 0L) {
			--n;
			sb.append((char) ('a' + n % 26L));
			n /= 26L;
		}
		sb.reverse();
		System.out.println(sb.toString());
	}
}
