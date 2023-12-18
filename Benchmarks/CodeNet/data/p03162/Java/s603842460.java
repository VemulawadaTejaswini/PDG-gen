import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class Main {
	
	private static Map<String,Integer> map = new HashMap<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] a = new int[n][3];

		for (int i = 0; i < n; i++) {
			
			int[] temp = new int[3];
			String[] input = br.readLine().split(" ");
			for (int j = 0; j <3; j++) {
				temp[j] = Integer.parseInt(input[j]);
			}
			
			a[i] = temp;
		}
		
		int ans = solve(a);
		
		System.out.println(ans);
	}

	private static int solve(int[][] a) {
		return helper(a,0,0);
	}

	private static int helper(int[][] a, int i, int last) {
		
		if(i==a.length)
			return 0;
		
		String key = i+":"+last;
		
		if(map.containsKey(key))
			return map.get(key);
		
		int max = 0;
		
		for (int j = 1; j <=3; j++) {
			if(j==last)
				continue;
			max = Math.max(a[i][j-1]+helper(a, i+1, j), max);
		}
		
		
		map.put(key, max);
		
		return max;
	}

}