import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			map.merge(a[i], 1, (v1, v2) -> v1 + v2);
			map.merge(a[i] - 1, 1, (v1, v2) -> v1 + v2);
			map.merge(a[i] + 1, 1, (v1, v2) -> v1 + v2);
		}
		int max = 0;
		for(int k : map.keySet()) {
			if(max < map.get(k)) {
				max = map.get(k);
			}
		}
		System.out.println(max);
	}
}