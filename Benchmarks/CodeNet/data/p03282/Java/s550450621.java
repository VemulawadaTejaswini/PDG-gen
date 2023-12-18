import java.util.*;

public class Main {

	static final long r = 5 * (long) Math.pow(10, 15);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		sc.close();
		int n = s.length();
		long ans = 0;
		for(int i = 0; i < n; ++i) {
			int tmp = Integer.parseInt(s.substring(i, i + 1));
			if(tmp != 1)
			ans += (long)tmp * r;
			else ans++;
			if(ans >= k) {
				ans = (long)tmp;
				break;
			}
		}
		System.out.println(ans);
	}

}
