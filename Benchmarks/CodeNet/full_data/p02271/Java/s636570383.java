import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(reader.readLine());
		String[] strArray = reader.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}
		int q = Integer.parseInt(reader.readLine());
		strArray = reader.readLine().split(" ");
		for (int i = 0; i < q; i++) {
			if (solve(arr, Integer.parseInt(strArray[i]))) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	private static boolean solve(int[] arr, int m) {
		Map<String, Boolean> memo = new HashMap<String, Boolean>();
		return solve(0, arr, m, memo);
	}

	private static boolean solve(int i, int[] arr, int m, Map<String, Boolean> memo) {		
		String key = i + "-" + m;
		boolean res = false;
		if (memo.containsKey(key)) {
			 res = memo.get(key);
		} else if (m == 0) {
			res = true;
		} else if (i >= arr.length) {
			res = false;
		} else {
			boolean res1 = solve(i + 1, arr, m, memo);
			boolean res2 = solve(i + 1, arr, m - arr[i], memo);
			res = res1 || res2;
		}		
		memo.put(key, res);		
		return res;
	}
}
