import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n 	   = Integer.parseInt(scanner.nextLine());
		String[] t = scanner.nextLine().split(" ");
		int[] nlis = new int[n];
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < n; i++) {

			nlis[i] = Integer.parseInt(t[i]);

			if(map.containsKey(nlis[i])) {

				map.put(nlis[i], map.get(nlis[i]) + 1);

			}else {

				map.put(nlis[i], 1);

			}

		}


		for(int i = 0; i < n; i++) {

			int ans = 0;

			for(Entry<Integer, Integer> e : map.entrySet()) {

				int x = 0;

				if(e.getKey() != nlis[i]) {

					x = e.getValue();
				}else {

					x = e.getValue() - 1;
				}
				ans += x >= 2 ? x * (x - 1) / 2 : 0;
			}
			System.out.println(ans);
		}
	}
}