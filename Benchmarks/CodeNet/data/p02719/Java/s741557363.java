import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long ans = -1;
		long[] tmp = new long[2];
		long i = -1;
		ans = Math.abs(n-k);
		long j = ans;
		if(n > k){
			long z = n/k;
			long w = z+1;
			z = Math.abs(n-z*k);
			w = Math.abs(n-w*k);
			System.out.println(Math.min(z, w));
		} else {
			while(ans != 0 || i != ans){
				ans = Math.abs(ans-k);
				if(ans == 0 || i == ans) {
					System.out.println(Math.min(ans, j));
					break;
				}
				i = j;
				j = ans;
			}
		}
	}
}
