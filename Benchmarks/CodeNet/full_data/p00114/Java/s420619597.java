import java.util.*;
import java.io.*;

public class Main {

	public static HashMap<Integer,Integer> factor (int n) {

		HashMap<Integer,Integer> ans = new HashMap<Integer,Integer>();
		int cnt = 1;
		while (n % 2 == 0) {
			n /= 2;
			ans.put(2, cnt);
			cnt++;
		}
		for (int i = 3; i <= n; i += 2) {
			cnt = 1;
			while (n % i == 0) {
				n /= i;
				ans.put(i, cnt);
				cnt++;
			}

		}

		return ans;
	}

	public static int lcm (int[] nums) {

		int sum = 1;
		HashMap<Integer,Integer> factor = new HashMap<Integer,Integer>();

		for (int i = 0; i < nums.length; i++) {
			HashMap<Integer,Integer> tmp = factor(nums[i]);
			for (int k : tmp.keySet()) {
				if(factor.containsKey(k)) {

					factor.put(k, Math.max(factor.get(k), tmp.get(k)));

				} else {
					factor.put(k,  tmp.get(k));
				}
			}
		}

		for (int k : factor.keySet())
			sum *= Math.pow(k, factor.get(k));

		return sum;

	}

	public static int solve (int a1, int m1, int a2, int m2, int a3, int m3) {

		int x, y, z;
		x = a1 % m1;
		y = a2 % m2;
		z = a3 % m3;
		int[] val = {x,y,z};
		int[] val2 = {a1,a2,a3};
		int[] val3 = {m1,m2,m3};

		int[] cnt3 = {1,1,1};

		for (int i = 0; i < 3; i++) {
			while (val[i] != 1) {
				val[i] = val[i] * val2[i] % val3[i];
				cnt3[i]++;
			}
		}
		return lcm(cnt3);

	}

	public static void main (String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			String s = br.readLine();;
			if (s == null) break;
			StringTokenizer st = new StringTokenizer(s," ");
			if (st.countTokens() < 6) break;

			int a1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int a3 = Integer.parseInt(st.nextToken());
			int m3 = Integer.parseInt(st.nextToken());

			System.out.println(solve(a1,m1,a2,m2,a3,m3));

		}

	}
}