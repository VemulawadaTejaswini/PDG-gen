import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		if ((B - A) % 2 == 0) {
			System.out.print((B - A) / 2);
		} else {
			System.out.print(Math.min(N - A, B - 1));
		}
	}
}