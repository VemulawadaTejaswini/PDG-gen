import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long count = 0;
		
		if (n <= m * 2) {
			count = n;
			m -= 2 * n;
			count += m / 4;
		} else {
			count = n;
		}
		System.out.println(count);
	}
}