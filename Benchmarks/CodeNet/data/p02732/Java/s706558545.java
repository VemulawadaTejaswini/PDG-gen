import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {

    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	long[] a = new long[2000001];
    	int[] data = new int[n];
    	for (int i=0;i<n;i++) {
    		data[i] = s.nextInt();
    		a[data[i]]++;
    	}

    	Map<Long, Long> map = new HashMap<Long, Long>();
    	long total = 0;
    	for (long z : data) {
    		map.put(z, a[(int)z] * (a[(int)z] - 1) / 2);
    	}
    	
    	for (Long key : map.keySet()) total += map.get(key);

    	for (int i=0;i<data.length;i++) {
    		long r = total;
    		long k = data[i];
    		if (a[(int)k] == 1) {
        		System.out.println(r);
    		} else {
    			long value = map.get(k);
    			long N = getN(value);
    			r -= value;
				r += (N-1)*(N-2)/2;
    			System.out.println(r);
			}
    	}

    }
    static long getN(long v) {
    	long x = (long) Math.sqrt(v) - 1;
    	while(x*(x-1) != 2*v) {
    		x++;
    	}
    	return x;
    }

    }
