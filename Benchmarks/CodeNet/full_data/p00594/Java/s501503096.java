import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int n = in.nextInt();
			if (n == 0)
				return;
			Map<Integer, Integer> HM = new HashMap<Integer, Integer>();
			int ans = 0;
			boolean judge = false;
			int index = n;
			for (int i = 0; i < n; i++) {
				int str = in.nextInt();
				if (HM.containsKey(str))
					HM.put(str, HM.get(str) + 1);
				else
					HM.put(str, 1);
				if (HM.get(str) > n / 2) {
					judge = true;
					ans = str;
					index = i + 1;
					break;
				}
			}
			for (int i = 0; i < n - index; i++) {
				in.nextInt();
			}
			System.out.println(judge ? ans : "NO COLOR");
		}
	}

	static public void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}