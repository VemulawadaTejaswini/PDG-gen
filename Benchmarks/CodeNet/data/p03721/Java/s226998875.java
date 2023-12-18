import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for(int i = 0; i < a; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(map.get(c) != null) {
				map.put(c, map.get(c) + d);
			} else {
				map.put(c, d);
			}
		}

		TreeMap<Integer, Integer> treeMap = new TreeMap(map);

		for (int key : treeMap.keySet()) {
            if(map.get(key) >= b) {
            	System.out.println(key);
            	break;
            } else {
            	b -= map.get(key);
            }
        }

	}

}
