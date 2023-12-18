import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < M ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			map.put(a[i], b[i]);
		}
		Object[] mapKey = map.keySet().toArray();
		Arrays.sort(mapKey);
		if(!map.containsKey(1) || map.size() == 1) {
			System.out.println("IMPOSSIBLE");
			return;
		} else {
			int cnt = 0;
			for(Integer nKey : map.keySet()) {
				cnt++;
				if(cnt == 2) {
					System.out.println("IMPOSSIBLE");
					return;
				}
				if(map.get(map.get(nKey)) == N) {
					System.out.println("POSSIBLE");
					return;
				}
			}
		}
		System.out.println("IMPOSSIBLE");
	}
}
