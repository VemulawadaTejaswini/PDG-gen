import java.io.*;
import java.math.BigDecimal;
import java.util.*;

class Main {
	static final String YES = "Yes";
	static final String NO = "No";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (Math.abs(Math.sqrt(a) + Math.sqrt(b) - Math.sqrt(c)) < 0.001) {
			System.out.println(NO);
			return;
		}

		if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}
	}
}
