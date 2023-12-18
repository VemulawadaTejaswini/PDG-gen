import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();

		if (H % 2 == 0 && W % 2 == 0) {
			System.out.println(H / 2L * W);
			return;
		}

		if (H % 2 == 1 && W % 2 == 1) {
			long a = (W / 2) * H + (H + 1) / 2;
			System.out.println(a);
			return;
		}

		if (H % 2 == 1) {
			long t = H;
			H = W;
			W = t;
		}

		long a = (W / 2L) * H + H / 2;
		System.out.println(a);
	}
}
