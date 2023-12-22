import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			if (n == 1)
				continue;
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 1; i < n; i++) {
				set.add(i * i % n);
			}
			Integer[] sqmod = new Integer[set.size()];
			set.toArray(sqmod);
			int[] f = new int[(n - 1) / 2 + 1];
			for (int i = 0; i < sqmod.length; i++) {
				for (int j = 0; j < sqmod.length; j++) {
					if (i == j)
						continue;
					int diff = sqmod[i] - sqmod[j];
					if (diff < 0)
						diff += n;
					if (diff > (n - 1) / 2)
						diff = n - diff;
					f[diff]++;
				}
			}
			for (int i = 1; i <= (n - 1) / 2; i++) {
				System.out.println(f[i]);
			}
		}
	}
}