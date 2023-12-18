import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
		sc.close();
		long ans = n / (a + b);
		ans = ans * a + ((n % (a + b)) <= a ? (n % (a + b)) : a);
		System.out.println(ans);
	}
}
