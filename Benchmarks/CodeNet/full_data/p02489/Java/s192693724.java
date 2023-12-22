import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int i;

		for (i = 1; i < 1000; i++) {
			a = sc.nextInt();
			if (a != 0) {
				System.out.printf("Case %d: %d\n", i, a);
			}
		}
	}
}