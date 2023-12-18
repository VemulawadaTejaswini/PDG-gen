import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextLong();
		long cnt = 0;
		long u, v, a, x;
		for(v = 0; v <= N; v++) {
			u = N + 1;
			for(a = 0; a <= v / 2; a++) {
				x = a ^ v - a;
				if(x < u) {
					cnt = ++cnt % 1000000007;
					u = x;
				}
			}
		}
		System.out.println(cnt);
	}
}