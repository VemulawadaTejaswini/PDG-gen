import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0;i < n;++i)
			v[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for(int i = 0;i < n;i+=2) {
			if(map1.containsKey(v[i])) {
				int cap = map1.get(v[i]);
				map1.remove(v[i]);
				map1.put(v[i], cap+1);
			}else {
				map1.put(v[i], 1);
			}
		}
		Map<Integer, Integer>map2 = new HashMap<Integer, Integer>();
		for(int i = 1;i < n;i+=2) {
			if(map2.containsKey(v[i])) {
				int cap = map2.get(v[i])+1;
				map2.remove(v[i]);
				map2.put(v[i], cap);
			}else {
				map2.put(v[i], 1);
			}
		}
		
		int max1 = 0;
		int max1_key = 0;
		for(Integer key : map1.keySet()) {
			if(max1 < map1.get(key)) {
				max1_key = key;
				max1 = map1.get(key);
			}
		}
		
		int max2 = 0;
		int max2_key = 0;
		for(Integer key : map2.keySet()) {
			if(max2 < map2.get(key)) {
				max2_key = key;
				max2 = map2.get(key);
			}
		}
		
		if(max1_key == max2_key) {
			if(max1 > max2) {
				max2 = 0;
				for(Integer key : map2.keySet()) {
					if(max2 < map2.get(key) && key != max1_key) {
						max2 = map2.get(key);
					}
				}
			}else {
				max1 = 0;
				for(Integer key : map1.keySet()) {
					if(max1 < map1.get(key) && key != max2_key) {
						max1 = map1.get(key);
					}
				}
			}
		}
		ans += n/2 - max1;
		ans += n/2 - max2;
		System.out.println(ans);
	}
}
