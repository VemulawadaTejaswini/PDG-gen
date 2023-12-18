import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        long len = lcd(n, m);
        Map<Long, Character> posMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	long idx = 1 + i * (len / n);
        	posMap.put(idx, s.charAt(i));
        }

        for(int i = 0; i < m; i++) {
        	long idx = 1 + i * (len / m);
        	if(posMap.containsKey(idx)) {
        		if(posMap.get(idx) != t.charAt(i)) {
        			System.out.println(-1);
        			return;
        		}
        	}
        }
        System.out.println(len);
    }

    private static long lcd(long a, long b) {
    	return a / gcd(a, b) * b;
    }
    private static long gcd(long a, long b) {
    	if(b == 0) return a;
    	return gcd(b, a % b);
    }
}
 