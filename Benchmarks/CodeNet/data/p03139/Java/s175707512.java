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
			long a = in.nextInt();
			long b = in.nextInt();

			U u = new U();
			u.d = a - b;
			u.t = a + b;
			u.a = a;
			u.b = b;

			aa.add(u);
		}
		Collections.sort(aa, (u1, u2) -> {
			if (u1.d > u2.d) {
				return 1;
			} else if (u1.d > u2.d) {
				return -1;
			} else {
				return 0;
			}
		});
		long r = 0;
		for (int i = 0; i < aa.size(); i = i + 2) {
			r += aa.get(i).a;
		}
		for (int i = 1; i < aa.size(); i = i + 2) {
			r -= aa.get(i).b;
		}

		in.close();
		System.out.println(r);
	}

}

class U {
	long d;
	long t;
	long a;
	long b;
}