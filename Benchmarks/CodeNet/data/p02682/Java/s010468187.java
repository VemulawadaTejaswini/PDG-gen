import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); // 1
		long b = sc.nextLong(); // 0
		long c = sc.nextLong(); // -1
		long k = sc.nextLong();

		if (a >= k) {
			System.out.println(k);
		} else if (a + b >= k) {
			System.out.println(a);
		} else {
			long ans = a + b - k + a;
			System.out.println(ans);
		}
	}
}
 
 
 
 
 
 
 
 
 
 
