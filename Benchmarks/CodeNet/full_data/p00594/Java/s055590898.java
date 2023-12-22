import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int n = in.nextInt();
			if (n == 0)
				return;
			System.gc();
			Map<Integer, Integer> HM = new HashMap<Integer, Integer>();
			boolean judge = false;
			for (int i = 0; i < n; i++) {
				int str = in.nextInt();
				if (HM.containsKey(str))
					HM.put(str, HM.get(str) + 1);
				else
					HM.put(str, 1);
			}
			for (Entry<Integer, Integer> entry : HM.entrySet()) {
				if (entry.getValue() > n / 2) {
					System.out.println(entry.getKey());
					judge = true;
					break;
				}
			}
			if (!judge) {
				System.out.println("NO COLOR");
			}
		}
	}

	static public void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}