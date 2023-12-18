
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> a = new HashMap<>();
		Map<Integer, Integer> b = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if(i % 2 == 0) {
				if(a.containsKey(tmp)) {
					int val = a.get(tmp);
					a.put(tmp, val + 1);
				} else {
					a.put(tmp, 1);
				}
			} else {
				if(b.containsKey(tmp)) {
					int val = b.get(tmp);
					b.put(tmp, val + 1);
				} else {
					b.put(tmp, 1);
				}
			}
		}
		Map.Entry<Integer, Integer> e1 = Map.entry(0, 0);
		Map.Entry<Integer, Integer> e2 = Map.entry(0, 0);
		for(Map.Entry<Integer, Integer> e : a.entrySet()) {
			if(e1.getValue() <= e.getValue()) {
				e2 = e1;
				e1 = e;
			}
		}
		Map.Entry<Integer, Integer> e3 = Map.entry(0, 0);
		Map.Entry<Integer, Integer> e4 = Map.entry(0, 0);
		for(Map.Entry<Integer, Integer> e : b.entrySet()) {
			if(e3.getValue() <= e.getValue()) {
				e4 = e3;
				e3 = e;
			}
		}
		if(e1.getKey() != e3.getKey()) {
			System.out.println(n - e1.getValue() - e3.getValue());
		} else {
			if(e1.getValue() + e4.getValue() <= e2.getValue() + e3.getValue()) {
				System.out.println(n - e2.getValue() - e3.getValue());
			} else {
				System.out.println(n - e1.getValue() - e4.getValue());
			}
		}
	}

}