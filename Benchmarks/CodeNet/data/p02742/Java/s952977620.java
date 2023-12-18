import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wuyue
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		if (m % 2 == 0 ) {
			System.out.println(n * (m/2));
		} else {
			if (n%2==0) {
				System.out.println((m/2 + m/2 +1)*(n/2));
			} else {
				System.out.println((m/2 + m/2 +1)*(n/2) + m/2 +1);
			}
		}
		
	}

}
