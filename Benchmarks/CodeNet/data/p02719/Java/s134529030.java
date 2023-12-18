import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		sc.close();

		long q = (long) Math.ceil((N * 1.0) / K);
		long ans = Math.min(Math.abs(N - (K * q)), Math.abs(N - (K * (q - 1))));
		System.out.println(ans);
	}
}
