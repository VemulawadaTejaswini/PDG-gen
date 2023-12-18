import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
	    boolean[] base = new boolean[1000001];
	    base[0] = true;
	    base[1] = true;
	    int count = 0;
	    for (int i = 2; i < base.length; i++) {
	        if (base[i]) {
	            continue;
	        }
	        count++;
	        for (int j = 2; i * j < base.length; j++) {
	            base[i * j] = true;
	        }
	    }
	    int idx = 0;
	    int[] primes = new int[count];
	    for (int i = 0; i < count; i++) {
	        if (!base[i]) {
	            primes[idx] = i;
	            idx++;
	        }
	    }
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer>[] counts = new HashMap[n];
		HashMap<Integer, Integer> lcms = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    counts[i] = new HashMap<>();
		    int x = sc.nextInt();
		    for (int j = 0; j < count && x > 1; j++) {
		        while (x % primes[j] == 0) {
		            if (counts[i].containsKey(primes[j])) {
		                counts[i].put(primes[j], counts[i].get(primes[j]) + 1);
		            } else {
		                counts[i].put(primes[j], 1);
		            }
		            if (!lcms.containsKey(primes[j]) || lcms.get(primes[j]) < counts[i].get(primes[j])) {
		                lcms.put(primes[j], counts[i].get(primes[j]));
		            }
		            x /= primes[j];
		        }
		    }
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
		    long num = 1;
		    for (Map.Entry<Integer, Integer> entry : lcms.entrySet()) {
		        Integer x = counts[i].get(entry.getKey());
		        int y = entry.getValue();
		        if (x != null) {
		            y -= x;
		        }
		        for (int k = 0; k < y; k++) {
		            num *= entry.getKey();
		            num %= MOD;
		        }
		    }
		    ans += num;
		    ans %= MOD;
		}
		System.out.println(ans);
   }

}
