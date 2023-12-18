import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] d = new int[n];
		HashMap<Integer, Integer> hm1 = new HashMap<>();
		int tmp;
		for (int i = 0; i < n; i++) {
			tmp = sc.nextInt();
			if (hm1.containsKey(tmp)) {
				hm1.put(tmp, hm1.get(tmp) + 1);
			} else {
				hm1.put(tmp, 1);
			}
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			tmp = sc.nextInt();
			if (hm1.containsKey(tmp)) {
				if (hm1.get(tmp) > 0) {
					hm1.put(tmp, hm1.get(tmp) - 1);
				} else {
					System.out.println("NO");
					return;
				}
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}