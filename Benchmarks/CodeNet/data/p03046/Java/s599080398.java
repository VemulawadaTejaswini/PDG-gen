import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		long K = sc.nextLong();
		long len = 1;
		for (int i = 0; i < M; i++) len *= 2;
		if (len - 1 <= K) {
			System.out.println(-1);
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (long i = 0; i < len - 1; i++) {
			sb.append(i).append(" ");
		}
		sb.append(K).append(" ");
		for (long i = len - 2; i >= 0; i--) {
			sb.append(i).append(" ");
		}
		sb.append(K);

		System.out.println(sb.toString());
	}
}
