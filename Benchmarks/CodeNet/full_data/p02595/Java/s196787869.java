import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int res = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			double dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

//			System.out.println(x + " " + y);

			if ((double) d >= dist) {
				res++;
			}

		}

		System.out.println(res);

	}

}