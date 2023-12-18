import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<>();

		int k[] = new int[n];
		int a[][] = new int[n][m];

		for (int i = 0; i < n; i++) {
			k[i] = sc.nextInt();
			for (int j = 0; j < k[i]; j++) {
				a[i][j] = sc.nextInt();

				Integer cnt = map.get(a[i][j]);
				if (cnt == null) {
					map.put(a[i][j],1);
				} else {
					map.put(a[i][j],cnt + 1);
				}
			}
		}

		ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,Integer>>(map.entrySet());

		int ans = 0;
		for(Entry e: list) {
			if ((int)e.getValue() == n) {
				ans++;
			}
		}

	System.out.println(ans);
	}
}
