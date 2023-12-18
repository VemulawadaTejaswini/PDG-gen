import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Map<Integer, Integer> map1 = new HashMap<>();
			Map<Integer, Integer> map2 = new HashMap<>();
			for(int i=0; i<n; i++) {
				int v = sc.nextInt();
				if(i%2 == 0) {
					if(map1.get(v)==null) 	map1.put(v, 1);
					else	map1.put(v, map1.get(v)+1);
				}
				else {
					if(map2.get(v)==null) 	map2.put(v, 1);
					else	map2.put(v, map2.get(v)+1);
				}
			}

			int max1_1 = 0;
			int max1_2 = 0;
			int key1_1 = 0;
			int key1_2 = 0;
			int max2_1 = 0;
			int max2_2 = 0;
			int key2_1 = 0;
			int key2_2 = 0;
			for(Integer key : map1.keySet()) {
				if(max1_1 <= map1.get(key)) {
					max1_2 = max1_1;
					key1_2 = key1_1;
					max1_1 = map1.get(key);
					key1_1 = key;
				}
			}
			for(Integer key : map2.keySet()) {
				if(max2_1 <= map2.get(key)) {
					max2_2 = max2_1;
					key2_2 = key2_1;
					max2_1 = map2.get(key);
					key2_1 = key;
				}
			}
			
			if(key1_1 == key2_1) {
				if(max1_1 >= max2_1) {
					max2_1 = max2_2;
					key2_1 = key2_2;
				}
				else {
					max1_1 = max1_2;
					key1_1 = key1_2;
				}
			}

			int count = 0;
			for(Integer key : map1.keySet()) {
				count += (map1.get(key)==max1_1 && key==key1_1)? 0 : map1.get(key);
			}
			for(Integer key : map2.keySet()) {
				count += (map2.get(key)==max2_1 && key==key2_1)? 0 : map2.get(key);
			}
			System.out.println(count);
		}
	}

}




