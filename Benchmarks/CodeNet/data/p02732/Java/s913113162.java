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
    	for (long z : data) {
    		map.put(z, a[(int)z]);
    	}


    	for (int i=0;i<data.length;i++) {
    		long r = 0;
    		long k = data[i];
    		for (Long key : map.keySet()) {
    			if (key == k) {
    				long value = map.get(key);
    				value--;
    				if (value >= 1) {
    					r += value * (value - 1) / 2;
    				}
    			} else {
    				long value = map.get(key);
    				r += value * (value - 1) / 2;
    			}
    		}
    		System.out.println(r);
    	}

    }

    }
