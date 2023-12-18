
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
		int[] max = new int[4];
		int[] max2 = new int[4];
		for(int i = 0; i < 4; i++) {
			max[i] = 0;
			max2[i] = 0;
		}
		for(Map.Entry<Integer, Integer> e : a.entrySet()) {
			if(max[1] <= e.getValue()) {
				max[2] = max[0];
				max[3] = max[1];
				max[0] = e.getKey();
				max[1] = e.getValue();
			}
		}
		for(Map.Entry<Integer, Integer> e : b.entrySet()) {
			if(max2[1] <= e.getValue()) {
				max2[2] = max2[0];
				max2[3] = max2[1];
				max2[0] = e.getKey();
				max2[1] = e.getValue();
			}
		}
		if(max[0] != max2[0]) {
			System.out.println(n - max[1] - max2[1]);
		} else {
			if(max[1] + max2[3] <= max2[1] + max[3]) {
				System.out.println(n - max2[1] - max[3]);
			} else {
				System.out.println(n - max[1] - max2[3]);
			}
		}
	}

}