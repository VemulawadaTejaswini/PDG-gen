import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long in = sc.nextLong();
		long ans = in / 11 * 2;
		long mod = in % (11 * 2);
		
		if (mod != 0) ans += (mod <= 6) ? 1 : 2;
		
		System.out.println(ans);		
	}
}
