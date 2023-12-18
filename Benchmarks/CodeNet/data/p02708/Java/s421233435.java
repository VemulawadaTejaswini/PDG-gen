import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), j = in.nextLong();
		//System.out.println(((2*n-k+1)*k/2 - (k-1)*k/2) % 1000000007);
		long s = 0;
		for (long k = j; k <= n+1; k++) {
			s = (s + (2*n-k+1)*k/2 - (k-1)*k/2 + 1) % 1000000007;
			//System.out.println(s);
		}
		System.out.println(s);
	}
}
