import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			map.put(i, sc.nextInt(););
		}

		int cnt = 0;
		cnt += map.get(0);
		for (int i = 0; i < N; i++) {
			if (i==N-1) {
				break;
			}

			if (map.get(i) <= map.get(i+1)) {
				for (int j = i; j < N-1; j++) {
					if (map.get(j) >= map.get(j+1)) {
						i = j+1;
						continue;
					}
					int num = map.get(j+1) - map.get(j);
					cnt += num;
				}
			}
		}
		System.out.println(cnt);
	}
}
