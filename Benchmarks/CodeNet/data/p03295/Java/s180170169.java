
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Integer> bri = new HashMap<>();
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(bri.containsKey(a)) {
				int val = bri.get(a);
				bri.put(a, Math.min(val, b));
			} else {
				bri.put(a, b);
			}
		}
		int ans = 0;
		while(!bri.isEmpty()) {
			int a = 0;
			int b = (int) Math.pow(10, 5);
			for(Map.Entry<Integer, Integer> e : bri.entrySet()) {
				if(e.getValue() < b) {
					b = e.getValue();
					a = e.getKey();
				} else if(e.getValue() == b) {
					a = Math.max(a, e.getKey());
				}
			}
			ans++;
			for(int i = 1; i < a + 1; i++) {
				if(bri.containsKey(i)) {
					bri.remove(i);
				}
			}
		}
		System.out.println(ans);
	}

}
