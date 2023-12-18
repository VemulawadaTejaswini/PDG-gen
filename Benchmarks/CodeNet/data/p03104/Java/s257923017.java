import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long ans;
		if (a == b) {
			ans = a;
        } else if (a == 0) {
			ans = function(b);
		} else {
			ans = function(a - 1) ^ function(b);
		}
		System.out.println(ans);
	}
	
	// 0からxまでの排他的論理和を計算する
	static long function(long x) {
		if (x % 2 == 0) {
			if (x % 4 == 0) {
				return x;
			} else {
				return x ^ 1L;
			}
		} else {
			if ((x + 1) % 4 == 0) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}
