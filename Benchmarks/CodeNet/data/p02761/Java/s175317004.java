import java.util.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int s[] = new int[m], c[] = new int[m];
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int ans = -1;
		boolean isexist = true;
		for (int i = 0; i < m; ++i) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
			if (map.containsKey(s[i])) {
				if (map.get(s[i]) != c[i])
					isexist = false;
			}
			if (n > 1) {
				if (s[i] == 1 && c[i] == 0)
					isexist = false;
			}
			map.put(s[i], c[i]);
		}
		sc.close();
		if (isexist) {
			StringBuffer tmp = new StringBuffer();
			tmp.append("1");
			for (int i = 1; i < n; ++i) {
				tmp.append("0");
			}
			for (int key : map.keySet()) {
				int value = map.get(key);
				tmp.replace(key - 1, key, String.valueOf(value));
			}
			ans = Integer.parseInt(tmp.toString());
		}
		System.out.println(ans);
	}
}
