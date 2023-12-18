import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] members = new int[n + 1];
		int[] sums = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			int x = sc.nextInt();
			members[i] = x;
			sums[x]++;
		}
		int max = 0;
		for (int i = 1; i <= n; i++) {
			int count = sums[i];
			if (count > 0) {
				int x = i;
				while (x != 1) {
					x = members[x];
					count++;
				}
			}
			if (max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}
