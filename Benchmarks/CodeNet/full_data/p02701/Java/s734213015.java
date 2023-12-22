

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(s[0], 1);
		int ans = 1;

		for (int i = 1; i < n; i++) {
			if (!map.containsKey(s[i])) {
				ans++;
				map.put(s[i], 1);
			}
		}

		System.out.println(ans);
	}

}
