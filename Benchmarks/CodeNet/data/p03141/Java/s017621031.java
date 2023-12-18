import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<U> aa = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			BigInteger a = in.nextBigInteger();
			BigInteger b = in.nextBigInteger();

			U u = new U();
			u.a = a;
			u.b = b;
			u.d = a.subtract(b);

			aa.add(u);
		}
		Collections.sort(aa, (u1, u2) -> (u1.d.subtract(u2.d)).signum());
		BigInteger r = BigInteger.ZERO;
		for (int i = 0; i < aa.size(); i = i + 2) {
			r = r.add(aa.get(i).a);
		}
		for (int i = 1; i < aa.size(); i = i + 2) {
			r = r.subtract(aa.get(i).b);
		}

		in.close();
		System.out.println(r);
	}

}

class U {
	BigInteger a;
	BigInteger b;
	BigInteger d;
}