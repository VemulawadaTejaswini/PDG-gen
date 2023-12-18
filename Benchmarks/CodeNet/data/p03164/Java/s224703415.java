import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		int[] a = new int[n];
		int[] w = new int[n];

		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			w[i] = Integer.parseInt(input[0]);
			a[i] = Integer.parseInt(input[1]);
		}
		
		long ans = solve(n,k,a,w);
		
		System.out.println(ans);
	}

	private static long solve(int n, int w, int[] value, int[] wt) {
		Map<String,Long> map = new HashMap<>();
		return helper(0,w,value,wt,map,n);
	}

	private static long helper(int curr, int w, int[] value, int[] wt, Map<String, Long> map, int n) {
		
		if(curr==n || w==0)
			return 0;
		
		String key = curr+":"+w;
		
		if(map.containsKey(key))
			return map.get(key);
		
		long max = 0;
		
		if(wt[curr]<=w)
			max =value[curr]+ helper(curr+1, w-wt[curr], value, wt, map, n);
		
		max = Math.max(max, helper(curr+1, w, value, wt, map, n));
		
		map.put(key, max);
		
		return max;
	}
}