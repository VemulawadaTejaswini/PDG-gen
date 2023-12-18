import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		long total = 0, ans = 0;
		for(int i = 0; i < M; i++) {
			long d = sc.nextLong();
			long c = sc.nextLong();
			total += c*d;
			ans += c;
		}
		System.out.println(ans - 1 + (total-1)/9);

	}

}