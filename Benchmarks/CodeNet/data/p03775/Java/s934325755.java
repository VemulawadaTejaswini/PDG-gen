import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		long sqrt = (long)Math.sqrt(N);
		for (long i = sqrt; i >= 1; i--) {
			if (N % i == 0) {
				int ans = Math.max(String.valueOf(i).length(), String.valueOf(N / i).length());
				System.out.println(ans);
				return;
			}
		}
	}
}