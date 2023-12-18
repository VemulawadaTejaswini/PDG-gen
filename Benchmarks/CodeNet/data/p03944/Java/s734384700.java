import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int w = scan.nextInt(); //x
		int h = scan.nextInt(); //y
		int n = scan.nextInt();

		int i = 0;
		int j = 0;

		int xko0 = 0;
		int yko0 = 0;
		int xko = w;
		int yko = h;

		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		List<Integer> a = new ArrayList<Integer>();

		for (i = 0; i < n; i++) {
			x.add(scan.nextInt());
			y.add(scan.nextInt());
			a.add(scan.nextInt());

		}
		/*
				System.out.println(x);
				System.out.println(y);
				System.out.println(a);
		*/
		for (j = 0; j < n; j++) {

			if (a.get(j) == 1) {

				if (xko0 <= x.get(j)) {

					xko0 = x.get(j);
				}

			} else if (a.get(j) == 2) {

				if (xko >= x.get(j)) {

					xko = xko - (w - x.get(j));
				}

			} else if (a.get(j) == 3) {

				if (yko0 <= y.get(j)) {

					yko0 = y.get(j);
				}

			} else if (a.get(j) == 4) {

				if (yko >= y.get(j)) {

					yko = yko - (h - y.get(j));
				}


			}

		}
/*
				System.out.println(xko0);
				System.out.println(xko);
				System.out.println(yko0);
				System.out.println(yko);
*/
		if (xko0 < xko && yko0 < yko) {
			System.out.println((xko - xko0) * (yko - yko0));

		} else {
			System.out.println(0);
		}

	}

}