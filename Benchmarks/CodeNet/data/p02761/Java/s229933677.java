import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt(), m = scanner.nextInt();
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	boolean flag = true;
    	for (int i = 0; i < m; i++) {
    		int key = scanner.nextInt(), value = scanner.nextInt();
    		if (map.containsKey(key)) {
    			if (map.get(key) != value) {
    				flag = false;
    			}
    		}else {
    			map.put(key, value);
    		}
    	}
    	if (!flag) {
    		System.out.println(-1);
    		return;
    	}else {
    		for(int i=0;i<=999;i++) {
    			if (ok(i, map, n)) {
    				System.out.println(i);
    				return;
    			}
    		}
    		flag = false;
    	}
    	if (!flag) {
    		System.out.println(-1);
    	}

    }
    
    static boolean ok(int n , Map<Integer, Integer> map, int length) {
    	String string = n + "";
    	int len = string.length();
    	if (len != length) return false;
    	for(Integer k : map.keySet()) {
    		if (k > len) {
    			return false;
    		}
    		int value = map.get(k);
    		if (string.charAt(k - 1) - '0' != value) {
    			return false;
    		}
    	}
    	return true;
    }
}
