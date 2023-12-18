import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L, R, min;
		L = sc.nextLong();
		R = sc.nextLong();
		sc.close();
		R = Math.min(R, L + 4038);
		min = 2018;
		for (long i = L; i < R; i++) {
			for (long j = i + 1; i <= R; i++) {
				long a = (i * j) % 2019;
				if (min > a) {
					min = a;
				}
			}
		}
		System.out.println(min);
	}
}
