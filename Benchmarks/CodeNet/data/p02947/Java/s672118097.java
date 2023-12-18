import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String count = sc.next();
		int ans = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < Integer.parseInt(count); i++) {
			char[] ary = sc.next().toCharArray();
			Arrays.sort(ary);
			String c = 	new String(ary);
				if (map.containsKey(c)) {
					ans = ans + map.get(c);
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}

		System.out.println(ans);
	}

}