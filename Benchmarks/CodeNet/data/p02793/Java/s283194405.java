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
		int[] arr = new int[n];
		HashMap<Integer, Integer> lcms = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    arr[i] = x;
		    for (int j = 0; j < count && x > 1; j++) {
		        int cnt = 0;
		        while (x % primes[j] == 0) {
		            cnt++;
		            x /= primes[j];
		        }
	            if (cnt > 0 && (!lcms.containsKey(primes[j]) || lcms.get(primes[j]) < cnt)) {
	                lcms.put(primes[j], cnt);
	            }
		    }
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
		    long num = 1;
		    for (Map.Entry<Integer, Integer> entry : lcms.entrySet()) {
		        int x = entry.getKey();
		        int y = entry.getValue();
		        for (int j = 0; j < y; j++) {
		            if (arr[i] % x == 0) {
		                arr[i] /= x;
		            } else {
		                num *= x;
		                num %= MOD;
		            }
		        }
		    }
		    ans += num;
		    ans %= MOD;
		}
		System.out.println(ans);
   }

}
