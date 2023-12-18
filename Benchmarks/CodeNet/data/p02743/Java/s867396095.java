import java.util.*;
import java.math.BigDecimal;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if (2*Math.sqrt(a*b) < (c-a-b)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		/*
		if (Math.sqrt(a) + Math.sqrt(b) - Math.sqrt(c) < 0) {
			y++;
		} else {
			n++;
		}
		if (Math.sqrt(c) - Math.sqrt(a)-Math.sqrt(b) > 0) {
			y++;
		} else {
			n++;
		}
		/*
		if (Math.sqrt(a) - Math.sqrt(c) < -Math.sqrt(b)) {
			y++;
		} else {
			n++;
		}

		if (Math.sqrt(b) - Math.sqrt(c) < -Math.sqrt(a)) {
			y++;
		} else {
			n++;
		}
		if (-Math.sqrt(c) < Math.sqrt(c)  -Math.sqrt(a)) {
			y++;
		} else {
			n++;
		}
		*/

	}
}