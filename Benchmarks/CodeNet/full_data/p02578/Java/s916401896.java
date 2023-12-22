import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long p = 0;
		long ss = 0;
		for (int i = 0; i < n; i++) {
			long c = sc.nextLong();
			if (c < p) {
				ss += p - c;
				continue;
			}
			p = c;
		}
		System.out.println(ss);
	}
}
