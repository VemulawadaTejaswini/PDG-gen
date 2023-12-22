import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = 1;
		long tooBig = 1000000000000000000;

		long n = sc.nextLong();
		for (long i = 0; i < n; i++) {
			p = p * sc.nextLong();
			if (p > tooBig) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(p);
	}
}