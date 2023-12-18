import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		
		long[] Xn = new long[N + 1];
		for (int i = 0; i < N; i++) {
			Xn[i] = sc.nextLong();
		}
		
		Xn[N] = X;
		
		Arrays.sort(Xn);
		
		long[] Dn = new long[N];
		for (int i = 0; i < N; i++) {
			Dn[i] = Xn[i+1] - Xn[i];
		}
		
		long ans = Dn[0];
		for (int i = 0; i < Dn.length; i++) {
			ans = gcd(ans, Dn[i]);
			if (ans == 1)
				break;
		}
		
		System.out.println(ans);
	}
	
	static long gcd(long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

}
