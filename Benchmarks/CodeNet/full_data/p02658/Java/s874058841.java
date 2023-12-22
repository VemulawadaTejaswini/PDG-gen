import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger p = new BigInteger("1");
		BigInteger tooBig = new BigInteger("1000000000000000000");

		String n = sc.nextLine();
		for (int i = 0; i < Integer.parseInt(n); i++) {
			BigInteger nextNumber = new BigInteger(sc.nextLine());
			p = p.multiply(nextNumber);
			if (p.compareTo(tooBig) == 1) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(p);
	}
}