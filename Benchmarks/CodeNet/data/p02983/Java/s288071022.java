
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		long div = 2019;
		if(l / div == r / div) {
			long ans = Long.MAX_VALUE;
			for(long i = l % div; i < r % div; i++) {
				for(long j = i + 1; j < r % div + 1; j++) {
					ans = Math.min(ans, (i * j) % div);
				}
			}
			System.out.println(ans);
		} else {
			System.out.println(0);
		}

	}

}
