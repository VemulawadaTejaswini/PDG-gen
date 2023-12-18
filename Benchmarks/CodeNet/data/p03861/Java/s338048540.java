import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();

		long kyu = 1000000000;


		long a1 = a / x;
		long b1 = b / x;

		long aa = a % x;
		long bb = b % x;

		if (aa == 0 && bb == 0) {

			System.out.println(b1 - a1 + 1);

		} else if (a == b) {

			if (aa == 0) {
				System.out.println(a1);
			} else if (aa > 0) {

				System.out.println(0);
			}
		}else if(b>kyu) {

			long ko=a/kyu;
			long ke=b/kyu;
			long koko=ko/x;
			long keke=ke/x;

			System.out.println((keke+keke*kyu)-(koko+koko*kyu));

		}else {
			System.out.println(b1-a1);
		}
	}

}