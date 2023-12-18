import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long M = 1L << sc.nextInt();
		long K = sc.nextLong();
		if (K >= M) {
			System.out.println(-1);
			return;
		}
		if (M == 2 && K == 0) {
			System.out.println("0 0 1 1");
			return;
		}
		if (M == 2) {
			System.out.println(-1);
			return;
		}
		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < M - 1; i++) {
			sb.append(i).append(" ");
		}
		sb.append(K).append(" ");
		for (long i = M - 2; i >= 0; i--) {
			sb.append(i).append(" ");
		}
		sb.append(K);
		System.out.println(sb.toString());
	}
}
