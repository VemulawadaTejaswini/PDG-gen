import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	
	public static void update(int[] BIT, int idx, int val) {
		for (; idx < BIT.length; idx += idx & (-idx)) {
			BIT[idx] += val;
		}
	}
	
	public static int query(int[] BIT, int idx) {
		int ans = 0;
		for (; idx > 0; idx -= idx & (-idx)) {
			ans += BIT[idx];
		}
		return ans;
	}
	
    public static void main(String args[] ) throws Exception {
//    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]), q = Integer.parseInt(input[1]);
		input = reader.readLine().split(" ");
		int[] c = new int[n + 1];
		for (int i = 0; i < n; i++) {
			c[i + 1] = Integer.parseInt(input[i]);
		}
		int[][] queries = new int[q][3];
		for (int i = 0; i < q; i++) {
			input = reader.readLine().split(" ");
			queries[i][0] = Integer.parseInt(input[0]);
			queries[i][1] = Integer.parseInt(input[1]);
			queries[i][2] = i;
		}
		Arrays.sort(queries, (A, B) -> A[1] - B[1]);
		int[] BIT = new int[n + 1];
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		int[] ans = new int[q];
		for (int i = 1; i <= n; i++) {
			if (map.containsKey(c[i])) {
				update(BIT, map.get(c[i]), -1);
			}
//			System.out.println(c[i]);
			map.put(c[i], i);
			update(BIT, i, 1);
			while (idx < q && i == queries[idx][1]) {
				ans[queries[idx][2]] = query(BIT, queries[idx][1]) - query(BIT, queries[idx][0] - 1);
				idx++;
			}
//			System.out.println(c[i]);
		}
		for (int i = 0; i < q; i++) {
			out.println(ans[i]);
		}
		out.flush();
		out.close();
    }
	

}
