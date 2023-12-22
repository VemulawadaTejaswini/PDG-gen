import java.util.*;
import java.io.*;

public class Main {
    static int[] values;
    static int[] weights;
    static int[] maxes;
    static int n;
    static HashMap<Integer, HashMap<Integer, Integer>> dp = new HashMap<>();
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		values = new int[n + 1];
		weights = new int[n + 1];
		maxes = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    values[i] = Integer.parseInt(line[0]);
		    weights[i] = Integer.parseInt(line[1]);
		}
		setMax(1, 0);
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    sb.append(dfw(Integer.parseInt(line[0]), Integer.parseInt(line[1]))).append("\n");
		}
		System.out.print(sb);
	}
	
	static void setMax(int idx, int value) {
	    if (idx > n) {
	        return;
	    }
	    maxes[idx] += value + weights[idx];
	    setMax(idx * 2, maxes[idx]);
	    setMax(idx * 2 + 1, maxes[idx]);
	}
	
	static int dfw(int idx, int value) {
	    if (idx <= 0) {
	        return 0;
	    }
	    if (dp.containsKey(idx)) {
	        if (dp.get(idx).containsKey(value)) {
	            return dp.get(idx).get(value);
	        }
	    } else {
	        dp.put(idx, new HashMap<>());
	    }
	    int max = 0;
	    if (value < weights[idx]) {
	        max = dfw(idx / 2, value);
	    } else if (maxes[idx] <= value) {
	        max = dfw(idx / 2, value - weights[idx]) + values[idx];
	    } else {
	        max = Math.max(dfw(idx / 2, value), dfw(idx / 2, value - weights[idx]) + values[idx]);
	    }
	    dp.get(idx).put(value, max);
	    return max;
	}
}
