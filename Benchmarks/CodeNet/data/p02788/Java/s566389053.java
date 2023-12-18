import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();
		int[] zahyo = new int[n];

		for (int i = 0; i < n; i++) {
			zahyo[i] = sc.nextInt();
			map.put(zahyo[i], ((sc.nextInt() - 1) / a) + 1);
		}

		Arrays.sort(zahyo);

		long attackSum = 0;

		for (int i = 0; i < n; i++) {
			int x = zahyo[i];
			int attackNum = map.get(x);
			if (attackNum < 1) {
				continue;
			}
			attackSum = attackSum + attackNum;
			int p = 1;
			while (true) {
				if (i + p > n - 1) {
					p--;
					break;
				}
				if (zahyo[i + p] <= x + 2 * d) {
					p++;
				} else {
					p--;
					break;
				}
			}
			for (int j = 0; j <= p; j++) {
				map.put(zahyo[i + j], map.get(zahyo[i + j]) - attackNum);
			}
		}

		print(attackSum);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}