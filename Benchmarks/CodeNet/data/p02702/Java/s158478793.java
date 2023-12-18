import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		long count = 0;
		for (int i = 0; i < length; i++) {
		    int x = arr[i] - '0';
		    HashMap<Integer, Integer> next = new HashMap<>();
		    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		        int z = (entry.getKey() * 10 + x) % 2019;
		        if (next.containsKey(z)) {
		            next.put(z, next.get(z) + entry.getValue());
		        } else {
		            next.put(z, entry.getValue());
		        }
		    }
		    if (next.containsKey(x)) {
		        next.put(x, next.get(x) + 1);
		    } else {
		        next.put(x, 1);
		    }
		    if (next.containsKey(0)) {
		        count += next.get(0);
		    }
		    map = next;
		}
		System.out.println(count);
	}
}

