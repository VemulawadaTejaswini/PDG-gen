import java.io.*;
import java.math.*;
import java.util.*;

class Main {

	public static int res = 0;
	public static int n, s;

	public static void solve (int cnt, int sum, int index, boolean[] nums) {
		
		if (cnt > n || index >= nums.length) return;
		if (cnt == n && sum == s) {
			res++;
			return;
		}
		
		if (nums[index] == true) {
			
			solve(cnt,sum,index+1,nums);
			
		} else {
			
			nums[index] = true;
			solve(cnt+1,sum+index,index+1,nums);
			
			nums[index] = false;
			solve(cnt,sum,index+1,nums);
			
		}
		
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
			solve(0,0,0,nums);
			ans.add(res);
			res = 0;

		}

		for (int a : ans)
			System.out.println(a);

	}

}