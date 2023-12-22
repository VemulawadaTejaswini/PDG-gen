import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
	private static long ans = 0;
	private static long max = 0;

	public static void main(String[] args) throws Exception {

		ExecutorService es = Executors.newFixedThreadPool(8);
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		try {
			es.execute(() -> {
				for(long x = 0; x < n / 8; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = n / 8; x < n / 4; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = n / 4; x < 3 * n / 8; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = 3 * n / 8; x < n / 2; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = n / 2; x < 5 * n / 8; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = 5 * n / 8; x < 6 * n / 8; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = 6 * n / 8; x < 7 * n / 8; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
			es.execute(() -> {
				for(long x = 7 * n / 8; x <= n; x++) {
					ans = ( a * x / b ) - a * ( x / b );
					System.out.println(x + "," + ans);
					if(ans > max)
						max = ans;
				}
			});
		} finally {
			es.shutdown();
	        es.awaitTermination(1, TimeUnit.MINUTES);
		}
		System.out.println(max);
	}
}
