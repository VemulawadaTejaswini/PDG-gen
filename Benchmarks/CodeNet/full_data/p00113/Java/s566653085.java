import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			Map<String, Integer> set = new HashMap<String, Integer>();

			StringBuilder sb = new StringBuilder();
			int c = 0;
			while (true) {
				p *= 10;
				int c1 = c;
				while (p < q) {
					p *= 10;
					c++;
				}
				int tmp = p;
				p %= q;
				if (p == 0) {
					sb.append(tmp / q);
					System.out.println(sb.toString());
					break;
				}
				String key = tmp + "," + p;
				if (set.containsKey(key)) {
					int cp = set.get(key);
					System.out.println(sb.toString());
					for (int i = 0; i < sb.length(); i++) {
						if (cp - (c - c1) <= i)
							System.out.print("^");
						else
							System.out.print(" ");
					}
					System.out.println();
					break;
				}
				set.put(key, c);
				for (int i = 0; i < c - c1; i++)
					sb.append(0);
				sb.append(tmp / q);
				c++;
			}
		}
	}
}