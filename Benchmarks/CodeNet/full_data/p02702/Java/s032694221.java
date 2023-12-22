import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length(), p = 2019;
		sc.close();
		long ans = 0;
		Map<Integer, Long> modlist = new HashMap<Integer, Long>();
		long val = 0;
		int m = 1, mode10 = 10 % p;
		for (int i = n - 1; i >= 0; --i) {
			int tmp = (int) (s.charAt(i) - '0');
			tmp %= p;
			tmp *= m;
			tmp %= p;
			val += (long)tmp;
			val %= (long)p;
			int key = (int)val;
			long value = 1;
			if (modlist.containsKey(key))
				value += modlist.get(key);
			modlist.put(key, value);
			ans += (key == 0 ? value : value - 1);
			m *= mode10;
			m %= p;
		}
		System.out.println(ans);
	}
}
