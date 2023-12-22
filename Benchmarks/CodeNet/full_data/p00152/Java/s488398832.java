import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			if (m == 0)
				break;
			String[] nums = new String[m];
			final Map<String, Integer> p = new HashMap<String, Integer>();
			for (int i = 0; i < m; i++) {
				String key = sc.next();
				nums[i] = (p.containsKey(key) ? "0" : "") + key;
				boolean st[] = new boolean[10];
				boolean sp[] = new boolean[10];
				p.put(nums[i], 0);
				for (int j = 0; j < 10; j++) {
					int fst = sc.nextInt();
					p.put(nums[i], p.get(nums[i]) + fst);
					if (j - 1 >= 0 && (sp[j - 1] || st[j - 1]))
						p.put(nums[i], p.get(nums[i]) + fst);
					if (j - 2 >= 0 && st[j - 2] && st[j - 1])
						p.put(nums[i], p.get(nums[i]) + fst);
					if (fst == 10) {
						st[j] = true;
						if (j == 9) {
							int f = sc.nextInt();
							int s = sc.nextInt();
							p.put(nums[i], p.get(nums[i]) + f);
							p.put(nums[i], p.get(nums[i]) + s);
							if (st[8]) {
								p.put(nums[i], p.get(nums[i]) + f);
							}
						}

					} else {
						int snd = sc.nextInt();
						p.put(nums[i], p.get(nums[i]) + snd);
						if (j - 1 >= 0 && st[j - 1])
							p.put(nums[i], p.get(nums[i]) + snd);
						if (snd + fst == 10) {
							sp[j] = true;
							if (j == 9) {
								int f = sc.nextInt();
								p.put(nums[i], p.get(nums[i]) + f);
							}
						}
					}
				}
			}
			Arrays.sort(nums, new Comparator<String>() {
				public int compare(String a, String b) {
					int pa = p.get(a);
					int pb = p.get(b);
					if (pa != pb) {
						return pb - pa;
					} else {
						return Integer.parseInt(a) - Integer.parseInt(b);
					}
				}
			});
			for (int i = 0; i < nums.length; i++) {
				System.out.println(Integer.parseInt(nums[i]) + " "
						+ p.get(nums[i]));
			}
		}
	}
}