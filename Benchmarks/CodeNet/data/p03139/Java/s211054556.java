import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<U> aa = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			U u = new U();
			u.d = a - b;
			u.t = a + b;
			u.a = a;
			u.b = b;

			aa.add(u);
		}
		Collections.sort(aa, (u1, u2) -> u1.d - u2.d);
		long r = 0;
		for (int i = 0; i < aa.size(); i = i + 2) {
			r += aa.get(i).a;
		}
//		for (int i = 1; i < aa.size(); i = i + 2) {
//			r -= aa.get(i).b;
//		}

		in.close();
		System.out.println(r);
	}

}

class U {
	int d;
	long t;
	int a;
	int b;
}