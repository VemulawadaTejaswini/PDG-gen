import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    int x = sc.nextInt();
		    if (type == 0) {
		        if (map.containsKey(x)) {
		            map.put(x, map.get(x) + 1);
		        } else {
		            map.put(x, 1);
		        }
		        count++;
		        sb.append(count).append("\n");
		    } else if (type == 1) {
		        if (map.containsKey(x)) {
		            sb.append(map.get(x));
		        } else {
		            sb.append(0);
		        }
		        sb.append("\n");
		    } else if (type == 2) {
		        if (map.containsKey(x)) {
		            count -= map.get(x);
		            map.remove(x);
		        }
		    } else {
		        int y = sc.nextInt();
		        Integer tmp = x - 1;
		        while ((tmp = map.higherKey(tmp)) != null && tmp <= y) {
		            for (int j = 0; j < map.get(tmp); j++) {
		                sb.append(tmp).append("\n");
		            }
		        }
		    }
		}
		System.out.print(sb);
	}
}

