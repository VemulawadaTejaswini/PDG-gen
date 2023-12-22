import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int x;

		for (; i <= n;) {
			if (i % 3 == 0) {
				System.out.printf(" " + i);
				i++;
				continue;
			}

			x = i;

			while (x != 0 && (x % 10) == 3) {
				System.out.printf(" " + i);
				break;
			}
			x /= 10;
		}
		i++;
		System.out.println("");
	}
}