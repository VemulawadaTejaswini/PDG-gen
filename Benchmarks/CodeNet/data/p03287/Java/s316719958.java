import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, Long> map = new HashMap<>();
		long answer = 0;
		map.put(0, 1L);
		for (int i = 0; i < n; i++) {
		    HashMap<Integer, Long> next = new HashMap<>();
		    int x = sc.nextInt();
		    for (Map.Entry<Integer, Long> entry : map.entrySet()) {
		        int key = (entry.getKey() + x) % m;
		        if (next.containsKey(key)) {
		            next.put(key, next.get(key) + entry.getValue());
		        } else {
		            next.put(key, entry.getValue());
		        }
		    }
		    if (next.containsKey(0)) {
		        answer += next.get(0);
		        next.put(0, next.get(0) + 1);
		    } else {
		        next.put(0, 1L);
		    }
		    map = next;
		}
		System.out.println(answer);
    }
}

