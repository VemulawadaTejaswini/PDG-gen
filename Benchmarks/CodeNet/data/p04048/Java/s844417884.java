import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), x = sc.nextLong();
		sc.close();
		long ans = n + x;
		long tmp = Math.abs(n - 2 * x);
		if(tmp != 0) {
			ans += x;
			long tmpr = x / tmp;
			ans += tmpr * 2 - 1;
		}
		System.out.println(ans);
	}

}
