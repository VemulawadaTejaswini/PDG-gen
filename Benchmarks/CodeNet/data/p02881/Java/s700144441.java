import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long min = Long.MAX_VALUE;
		for (int i = 1; i <= Math.sqrt(n); i++) {
		    for (int j = i; j < 10; j++) {
		        if (n % i == 0) {
              		min = Math.min(min, i - 1 + n / i - 1);
 		        }
		    }
		}
		System.out.println(min);
	}
}
