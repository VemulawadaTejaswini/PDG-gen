import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long an = 1;

		int i = 1;

		for (i = 1; i <= n; i++) {

			an = (an * i) % 1000000007;
		}

		System.out.println(an);

	}

}
