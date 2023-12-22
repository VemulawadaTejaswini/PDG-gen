import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] dep = new int[n];
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				String deps = sc.next();
				String[] depss = deps.split(":");
				dep[i] = Integer.parseInt(depss[0]) * 3600
						+ Integer.parseInt(depss[1]) * 60
						+ Integer.parseInt(depss[2]);
				String arrs = sc.next();
				String[] arrss = arrs.split(":");
				arr[i] = Integer.parseInt(arrss[0]) * 3600
						+ Integer.parseInt(arrss[1]) * 60
						+ Integer.parseInt(arrss[2]);
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				int r = 1;
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > dep[j])
						r++;
				}
				max = Math.max(max, r);
			}
			System.out.println(max);
		}
		sc.close();
	}
}