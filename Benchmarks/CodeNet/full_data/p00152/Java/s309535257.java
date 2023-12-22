import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static char[] voice;
	static int i = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int m = sc.nextInt();
			if (m == 0)
				break;
			Integer[] nums = new Integer[m];
			final Map<Integer, Integer> p = new HashMap<Integer, Integer>();
			for (int i = 0; i < m; i++) {
				nums[i] = sc.nextInt();
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
			Arrays.sort(nums, new Comparator<Integer>() {
				public int compare(Integer a, Integer b) {
					int pa = p.get(a);
					int pb = p.get(b);
					if (pa != pb) {
						return pb - pa;
					} else {
						return a - b;
					}
				}
			});
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i] + " " + p.get(nums[i]));
			}
		}
	}
}