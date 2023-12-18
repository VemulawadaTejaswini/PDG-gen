import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		long n = Long.parseLong(line);
		long ans = 0;
		
		for (long k = Math.min(n, 10000); k >= 1; k--) {
			long i = n/k - 1;
			if (i > 0 && n / i == n % i) {
				ans+=i;
				//System.out.println("i=" + i);   //////////
			}
		}
		for (long i = 1; i < n/10000 - 1; i++) {
			if (n / i == n % i) {
				ans+=i;
				//System.out.println("i=" + i);   //////////
			}
		}
		System.out.println(ans);
	}
}
