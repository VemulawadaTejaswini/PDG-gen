import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			if(i % 2 == 0) {
				if(map1.containsKey(v[i])) {
					map1.put(v[i], map1.get(v[i]) + 1);
				} else {
					map1.put(v[i], 1);
				}
			} else {
				if(map2.containsKey(v[i])) {
					map2.put(v[i], map2.get(v[i]) + 1);
				} else {
					map2.put(v[i], 1);
				}
			}
		}
		int max1 = v[0];
		int n_max1 = 0;
		int max2 = v[1];
		int n_max2 = 0;
		for(int i = 2; i < n; i++) {
			if(i % 2 == 0) {
				if(map1.get(max1) <= map1.get(v[i])) {
					n_max1 = max1;
					max1 = v[i];
				}
			} else {
				if(map2.get(max2) <= map2.get(v[i])) {
					n_max2 = max2;
					max2 = v[i];
				}
			}
		}
		if(max1 != max2) {
			System.out.println(n - map1.get(max1) - map2.get(max2));
		} else {
			if(map1.size() == 1 && map2.size() == 1) {
				System.out.println(n / 2);
			}
			if(map1.get(max1) > map2.get(max2)) {
				System.out.println(n - map1.get(max1) - map2.get(n_max2));
			} else {
				System.out.println(n - map1.get(n_max1) - map2.get(max2));
			}
		}
	}
}
