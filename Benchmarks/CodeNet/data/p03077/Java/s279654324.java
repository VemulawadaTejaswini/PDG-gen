import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();

		long bottleNeck = 1000000000000000l;
		bottleNeck = Math.min(bottleNeck,a);
		bottleNeck = Math.min(bottleNeck,b);
		bottleNeck = Math.min(bottleNeck,c);
		bottleNeck = Math.min(bottleNeck,d);
		bottleNeck = Math.min(bottleNeck,e);


		System.out.println(5 + n/bottleNeck);

	}
}
