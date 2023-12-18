import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Long> map = new HashMap<>();
		long cnt = 0;
		for ( int i = 0; i < n; i++ ) {
			char[] s = in.next().toCharArray();
			Arrays.sort(s);
			String key = new String(s);
			Long value = (map.containsKey(key) ? map.get(key) + 1 : 1);
			map.put(key, value);
			//			if ( map.containsKey(key) ) {
			//				// cnt += map.get(key);
			//				map.put(key, map.get(key) + 1);
			//			} else {
			//				map.put(key, (long) 1);
			//			}
		}

		for ( Entry<String, Long> en : map.entrySet() ) {
			Long v = en.getValue();
			cnt += v * (v - 1) / 2;
		}

		System.out.println(cnt);
		in.close();
	}
}