import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer x = sc.nextInt();
		Long[] cost = new Long[n];
		Long[] tmpA = new Long[n];
		Long[] a = new Long[n];
		Integer minIdx = 0;
		for (int i = 0; i < n; i++) {
			cost[i] = 0L;
			tmpA[i] = sc.nextLong();
		}
		for (int i = 0; i < n; i++) {
			if (tmpA[minIdx] > tmpA[i])
				minIdx = i;
		}
		for (int i = minIdx; i < n; i++) {
			a[i - minIdx] = tmpA[i];
		}
		for (int i = 0; i < minIdx; i++) {
			a[i + (n - minIdx)] = tmpA[i];
		}

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				cost[i] = a[i];
			} else {
				Long direct = a[i];
				Long indirect = a[0] + x;
				if (direct > indirect) {
					cost[i] = cost[i - 1] + indirect;
				} else {
					cost[i] = cost[i - 1] + direct;
				}
			}
		}
		System.out.println(cost[n - 1]);
	}
}
