import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		ArrayList<Long> ary = new ArrayList<Long>();
		long temp = (long)Math.sqrt(N);
		long ans1 = Long.MAX_VALUE / 3;
		long ans2 = Long.MAX_VALUE / 3;
		for(long i = 1; i <= temp; i++) {
			if(N % i == 0) {
				if((ans1 - 1) + (ans2 - 1) > (i - 1) + (N / i - 1)) {
					ans1 = i;
					ans2 = N / i;
				}
			}
		}
		System.out.println((ans1 - 1) + (ans2 - 1));
	}
}
