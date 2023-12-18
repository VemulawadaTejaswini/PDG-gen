
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();

		long min = 9999;
		for(long i = l ; i < r ; i++) {
			long mod = (i * (i + 1)) % 2019;
			if(mod == 0L) {
				System.out.println(mod);
				System.exit(0);;
			}
			if(mod < min) {
				min = mod;
			}
		}
		System.out.println(min);
		sc.close();

	}

}
