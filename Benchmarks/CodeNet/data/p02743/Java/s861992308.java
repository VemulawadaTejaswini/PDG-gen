import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x = 2.0 * Math.sqrt(a) * Math.sqrt(b);

		if (x < (double) (c - a - b)) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
	}

}
