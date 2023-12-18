import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		
		List<List<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i <k; i++) {
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0])-1;
			int o = Integer.parseInt(input[1])-1;
			
			list.get(m).add(o);
		}
		
		int longestPath = getLongestPath(list);
		
		System.out.println(longestPath);
	}

	private static int getLongestPath(List<List<Integer>> list) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		int max = 0;
		
		for (int i = 0; i < list.size(); i++) {
			max = Math.max(max, helper(list, i, map));
		}
		
		return max;
		
	}

	private static int helper(List<List<Integer>> list, int curr, Map<Integer, Integer> map) {
		
		if(curr==list.size())
			return 0;
		
		if(map.containsKey(curr))
			return map.get(curr);
		
		int max = 0;
		
		for(int k : list.get(curr)) {
			max = Math.max(max, 1+helper(list, k, map));
		}
		
		map.put(curr, max);
		
		return max;
	}
}