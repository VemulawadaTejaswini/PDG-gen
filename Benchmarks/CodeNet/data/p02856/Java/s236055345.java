import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		long n = 0;
		long sum = 0;
		for (int i = 0; i < M; i++) {
			long d = sc.nextLong();
			long c = sc.nextLong();
			n += c;
			sum += d * c;
		}
		System.out.println((n - 1) + (sum - 1) / 9);
	}
}
