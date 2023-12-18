import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] prices = new int[2][3];
		for (int i = 0; i < 2; i++) {
		    String[] line = br.readLine().split(" ", 3);
		    for (int j = 0; j < 3; j++) {
		        prices[i][j] = Integer.parseInt(line[j]);
		    }
		}
		ArrayList<HashMap<Long, Long>> dp1 = new ArrayList<>();
		ArrayList<HashMap<Long, Long>> dp2 = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
		    dp1.add(new HashMap<>());
		    dp2.add(new HashMap<>());
		}
		long m = dfw(dp1, prices[0], prices[1], 2, n);
		System.out.println(dfw(dp2, prices[1], prices[0], 2, m));
	}
	
	static long dfw(ArrayList<HashMap<Long, Long>> dp, int[] buys, int[] sells, int idx, long value) {
	    if (idx < 0) {
	        return value;
	    }
	    if (dp.get(idx).containsKey(value)) {
	        return dp.get(idx).get(value);
	    }
	    long max = dfw(dp, buys, sells, idx - 1, value);
	    if (buys[idx] < sells[idx]) {
	        for (long i = 1; i * buys[idx] <= value; i++) {
	            max = Math.max(max, dfw(dp, buys, sells, idx - 1, value - i * buys[idx]) + i * sells[idx]);
	        }
	    }
	    dp.get(idx).put(value, max);
	    return max;
	}
}
