import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

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

		Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);

		for (int key : map.keySet()) {
            if(map.get(key) >= b) {
            	System.out.println(key);
            	break;
            } else {
            	b -= map.get(key);
            }
        }

	}

}
