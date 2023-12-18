import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		HashMap<Long, Long> a = new HashMap<Long, Long>();
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			long x = sc.nextInt();
			
			if (a.get(x) == null) {
				a.put(x, Long.valueOf("1"));
				ans++;
			} else if (a.get(x) == 0) {
				a.put(x, Long.valueOf("1"));
				ans++;
			} else if (a.get(x) == 1) {
				a.put(x, Long.valueOf("0"));
				ans--;
			}
		}
		
		
		System.out.println(ans);

		sc.close();
	}
}