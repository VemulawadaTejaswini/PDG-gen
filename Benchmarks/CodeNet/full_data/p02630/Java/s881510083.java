import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

		long total = 0;
		for (int i=0; i<n; i++){
			int a = sc.nextInt();
			total += a;
			if (map.containsKey(a)){
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++){
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (map.containsKey(b)){
				int cnt = map.get(b);
				total += (c-b) * cnt;
				map.put(b, 0);
				if (map.containsKey(c)){
					map.put(c, map.get(c) + cnt);
				} else {
					map.put(c, cnt);
				}
			}
			System.out.println(total);
		}
	}

}