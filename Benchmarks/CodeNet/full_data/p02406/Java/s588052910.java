
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		do {
			int x = i;
			if (x % 3 == 0 || x % 10 == 3) {
				System.out.printf(" %d", x);
			}
		} while (++i <= n);
		System.out.println();
	}

}