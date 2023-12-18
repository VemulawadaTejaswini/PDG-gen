import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	Map<String, Integer> map = new HashMap<>();
    	for (int i = 0; i < N; i++) {
    		String s = sc.next();
    		if (map.containsKey(s)) {
    			map.put(s, map.get(s)+1);
    		} else {
    			map.put(s, 1);
    		}
    	}
    	int M = sc.nextInt();
    	for (int i = 0; i < M; i++) {
    		String s = sc.next();
    		if (map.containsKey(s)) {
    			map.put(s, map.get(s)-1);
    		} else {
    			map.put(s, -1);
    		}
    	}
    	int max = 0;
    	for (String key : map.keySet()) {
    		int value = map.get(key);
    		if (max < value) {
    			max = value;
    		}
    	}
    	System.out.println(max);
    }
}