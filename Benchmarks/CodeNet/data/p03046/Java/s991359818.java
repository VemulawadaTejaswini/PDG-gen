import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		long K = sc.nextLong();
		long x = 1;
		M--;
		while (M-- > 0) x *= 2;
		if (x <= K) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < x; i++) {
			sb.append(i).append(" ");
		}
		sb.append(K).append(" ");
		for (long i = x - 1; i >= 0; i--) {
			sb.append(i).append(" ");
		}
		sb.append(K);

		System.out.println(sb.toString());
	}
}
