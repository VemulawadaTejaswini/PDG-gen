import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
 		int n = Integer.parseInt(first[0]);
		int q = Integer.parseInt(first[1]);
		String[] nums = br.readLine().split(" ", n);
		Query[] queries = new Query[q];
		for (int i = 0; i < q; i++) {
		    String[] line = br.readLine().split(" ", 2);
		    queries[i] = new Query(i, Integer.parseInt(line[0]) - 1, Integer.parseInt(line[1]) - 1);
		}
		Arrays.sort(queries);
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int[] ans = new int[q];
		int idx = 0;
		for (int i = 0; i < n; i++) {
		    int y = Integer.parseInt(nums[i]);
		    if (map.containsKey(y)) {
		        int x = map.get(y);
		        int left = 0;
		        int right = list.size();
		        while (true) {
		            int m = (left + right) / 2;
		            if (list.get(m) == x) {
		                list.remove(m);
		                break;
		            } else if (list.get(m) < x) {
		                left = m + 1;
		            } else {
		                right = m;
		            }
		        }
		    }
		    list.add(i);
		    map.put(y, i);
		    while (idx < q && queries[idx].right == i) {
		        int left = -1;
		        int right = list.size() - 1;
		        while (right - left > 1) {
		            int m = (left + right) / 2;
		            if (list.get(m) < queries[idx].left) {
		                left = m;
		            } else {
		                right = m;
		            }
		        }
		        ans[queries[idx].idx] = list.size() - right;
		        idx++;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int x : ans) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Query implements Comparable<Query> {
	    int idx;
	    int left;
	    int right;
	    
	    public Query(int idx, int left, int right) {
	        this.idx = idx;
	        this.left = left;
	        this.right = right;
	    }
	    
	    public int compareTo(Query another) {
	        return right - another.right;
	    }
	}
}
