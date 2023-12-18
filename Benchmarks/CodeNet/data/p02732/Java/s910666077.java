import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		boolean flag = false;
		HashMap<Integer, Integer> hp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			if (hp.containsKey(arr[i])) {
				hp.put(arr[i], hp.get(arr[i]) + 1);
				flag = true;
			} else
				hp.put(arr[i], 1);
		}
		for (int k = 0; k < n; k++) {
			int ans = 0;
			hp.put(arr[k], hp.get(arr[k]) - 1);
			Set<Integer> keys = hp.keySet();
			if (flag) {
				for (int val : keys) {
					int temp = hp.get(val);
					if (temp > 1) {
						ans += temp * (temp - 1) / 2;
					}
				}
			}
			System.out.println(ans);
			hp.put(arr[k], hp.get(arr[k]) + 1);
		}

	}
}
