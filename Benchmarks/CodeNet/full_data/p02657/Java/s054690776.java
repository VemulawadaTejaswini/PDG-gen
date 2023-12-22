import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			BigInteger p = new BigInteger("1");

			int n = Integer.parseInt(sc.nextLine());

			for (int i = 0; i < n; i++) {
				BigInteger next = new BigInteger(sc.nextLine());
				p = p.multiply(next);
			}

			if (p.compareTo(new BigInteger("1000000000000000000")) == 1) {
				System.out.println(-1);
			} else {
				System.out.println(p.toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}