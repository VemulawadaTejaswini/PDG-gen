
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();

		long min = 9999;
		for(long i = l ; i < r ; i++) {
			for(long j = i + 1 ; j <= r ; j++) {
				long mod = (i * j) % 2019;
				if(mod == 0L) {
					System.out.println(mod);
					System.exit(0);;
				}
				if(mod < min) {
					min = mod;
				}
			}
		}
		System.out.println(min);
		sc.close();

	}

}
