import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public int calcGCD(int a_in, int b_in) {
		int a, b;
		if (a_in == b_in) { return a_in;
		} else if (a_in < b_in) { a = b_in; b = a_in;
		} else { a = a_in; b = b_in; }

		int r = a % b;
		if (r == 0) { return b;
		} else { return calcGCD(b, r); }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();

		while (sc.hasNext()) {
			int a = sc.nextInt(), b = sc.nextInt();
			int gcd = m.calcGCD(a, b);
			System.out.println(gcd+" "+(a*b/gcd));
		}

	}
}