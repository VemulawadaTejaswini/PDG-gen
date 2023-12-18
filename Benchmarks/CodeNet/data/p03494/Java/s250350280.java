
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long n = sc.nextLong();
			long[] a = new long[(int) n];
			int count = 0;
			while (true) {
				for (int i = 0; i < n; i++) {
					if (a[i] % 2 != 0) {
						System.out.println(count);
						System.exit(0);
					} else {
						a[i] /= 2;
					}
				}
				count++;
			}
		}
	}
}