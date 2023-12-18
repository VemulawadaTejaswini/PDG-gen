import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			char[] s = sc.next().toCharArray();
			Arrays.sort(s);
			String ss = new String(s);
			Integer cnt = map.get(ss);
			if (cnt == null) cnt = 0;
			map.put(ss, cnt + 1);
		}
		long ans = 0;
		for (long x: map.values()) {
			ans += x * (x - 1) / 2;
		}
		System.out.println(ans);
	}
}