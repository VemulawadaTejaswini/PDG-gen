import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long L = sc.nextLong();
		long R = sc.nextLong();

		long ans = Long.MAX_VALUE;
		for (long i = L; i < R; i++) {
			long tmp =0;
			for (long j = i+1; j <= R; j++) {
				tmp=(i*j)%2019;
				ans = Math.min(ans, tmp);
			}
		}
		System.out.println(ans);
	}
}
