import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger v = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger w = sc.nextBigInteger();
		BigInteger t = sc.nextBigInteger();
		if (b.compareTo(a) < 0  || v.compareTo(w) <= 0) {
			System.out.println("NO");
			return;
		}
//			double temp = (b-a) * 1.0/(v-w);
		if (t.multiply(v.subtract(w)).compareTo(b.subtract(a))>=0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		return;
	}

	}

