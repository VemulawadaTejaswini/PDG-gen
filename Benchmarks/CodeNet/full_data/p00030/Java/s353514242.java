import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
	public static int res = 0;
	public static int n, s;
	
	public static void solve (int cnt, int sum, boolean[] nums, Stack<Integer> list) {
		if (cnt == n) {
			if (sum == s) {
				res++;
			}
			return;
			
		} else {
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == false) {
					if (list.size() != 0) {
						if (!(list.pop() < i)) continue;
					}
					nums[i] = true;
					list.push(i);
					solve(cnt + 1,sum + i,nums,list);
					nums[i] = false;
				}
			}
			
		}
		return;
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			if (n == 0 && s == 0) break;
			boolean[] nums = new boolean[10];
			Arrays.fill(nums, false);
			solve(0,0,nums,new Stack<Integer>());
			ans.add(res);
			res = 0;
			
		}
		
		for (int a : ans)
			System.out.println(a);
		
	}

}