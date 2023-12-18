import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		if (H % 2 == 0 && W % 2 == 0) {
			System.out.println((long) H * W / 2L);
			return;
		}
		if (H % 2 == 1) {
			long t = H;
			H = W;
			W = t;
		}

		long a = W / 2L * H;
		if (W % 2 == 1) {
			a += (H + 1) / 2;
		}

		System.out.println(a);
	}
}
