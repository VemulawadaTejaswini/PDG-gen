import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			ans += map.getOrDefault(i - A[i], 0);
			int c = A[i] + i;
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(ans);
	}
}
