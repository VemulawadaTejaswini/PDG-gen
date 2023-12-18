import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<HashMap<Integer, Integer>> list = new ArrayList<>();
		HashMap<Integer, Integer> all = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    HashMap<Integer, Integer> map = getMap(sc.nextInt());
		    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		        int key = entry.getKey();
		        int value = entry.getValue();
		        if (!all.containsKey(key) || all.get(key) < value) {
		            all.put(key, value);
		        }
		    }
		    list.add(map);
		}
		long[] tmp = new long[n];
		Arrays.fill(tmp, 1L);
		for (Map.Entry<Integer, Integer> entry : all.entrySet()) {
		    int key = entry.getKey();
		    int value = entry.getValue();
		    for (int i = 0; i < n; i++) {
		        if (list.get(i).containsKey(key)) {
		            tmp[i] *= pow(key, value - list.get(i).get(key));
		        } else {
		            tmp[i] *= pow(key, value);
		        }
		        tmp[i] %= MOD;
		    }
		}
		long ans = 0;
		for (long x : tmp) {
		    ans += x;
		    ans %= MOD;
		}
		System.out.println(ans);
   }
   
   static long pow(long x, long y) {
       if (y == 0) {
           return 1;
       } else if (y % 2 == 0) {
           return pow(x * x % MOD, y / 2);
       } else {
           return pow(x, y - 1) * x % MOD;
       }
   }
    
    static HashMap<Integer, Integer> getMap(int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(x); i++) {
            while(x % i == 0) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
                x /= i;
            }
        }
        if (x > 1) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        return map;
    }
}

