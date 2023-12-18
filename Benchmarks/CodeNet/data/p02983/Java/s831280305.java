import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int l;
		int r;

		Scanner sc = new Scanner(System.in);

		l =  sc.nextInt();
		r =  sc.nextInt();

		int res;

		if (r - l > 3000) {
			res = 0;
		} else {

			res = 2018;

			for (int i = l; i < r; i++) {

				for (int j = i+1;j <= r; ++j) {
					res = Math.min(res, (i * j) % 2019);
				}

			}
		}

		System.out.println(res);

	}
}
