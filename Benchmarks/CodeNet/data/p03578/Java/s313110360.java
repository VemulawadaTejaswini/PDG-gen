import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0 ; i < n ; i++) d[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] t = new int[m];
		for(int i = 0 ; i < m ; i++) {
			t[i] = sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < n ; i++) {
			if(!map.containsKey(d[i])) {
				map.put(d[i], 1);
			} else {
				map.put(d[i], map.get(d[i]) + 1);
			}
		}
		for(int i = 0 ; i < m ; i++) {
			if(!map.containsKey(t[i]) || map.get(t[i]) == 0) {
				System.out.println("NO");
				return;
			} else {
				map.put(t[i], map.get(t[i]) - 1);
			}
		}
		System.out.println("YES");
	}
}
