import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long[] abcde = new long[5];

		for (int i = 0; i < 5; i++) {
			abcde[i] = sc.nextLong();
		}
		Arrays.sort(abcde);

		System.out.println((long) Math.ceil((double) n / abcde[0]) + 4);
		sc.close();
	}
}