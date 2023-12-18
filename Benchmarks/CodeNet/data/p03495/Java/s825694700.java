import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		int time = map.size() - k < 0 ? map.size() : k;
		int l = map.values().stream().sorted().limit(time).mapToInt(f -> f).sum();
		System.out.println(l);
	}
}
