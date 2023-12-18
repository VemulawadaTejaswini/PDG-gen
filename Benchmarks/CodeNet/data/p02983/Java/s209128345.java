import java.util.Scanner;

public class Main {
	final static long mod = 2019;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		sc.close();
		long min = Long.MAX_VALUE;
		for(long i = L; i <= R - 1; i++) {
			long r = (i * (i + 1)) % mod;
			// System.out.println(i + "*" + (i + 1) + "%mod=" + r);
			if(r == 0) { System.out.println(0); return; }
			min = Math.min(min, r);
		}
		System.out.println(min);
	}
}
