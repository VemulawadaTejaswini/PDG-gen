import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 082
	// https://atcoder.jp/contests/abc082/tasks
	final static int MOD = 10007;
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] houseki = new int[n];
		int deleteOP = Math.min(n, k);
		long res = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			houseki[i] = sc.nextInt();
		}
		
		for (int i = 0; i < deleteOP; i++) {
			int opAB = k - i;
			if (opAB < 0) { continue;}
			int[] selected = new int[opAB];
			for (int j = 0; j <= opAB; j++) {
				int a = j;
				int b = opAB - j;
				int pos = 0;
				int idx = 0;
				while (a > 0 && pos > 0 && idx < selected.length) {
					selected[idx] = houseki[pos];
					a--;
					idx++;
					pos++;
				}
				
				pos = houseki.length - 1;
				while (b > 0 && pos > 0 && idx < selected.length) {
					selected[idx] = houseki[pos];
					b--;
					idx++;
					pos--;
				}
				System.out.println(Arrays.toString(selected));
				int cnt = i;
				while (isSomeMinus(selected) && cnt > 0) {
					int index = findMinmalIndex(selected);
					selected[index] = 0;
					cnt--;
				}
				res = Math.max(res, sumOfArray(selected));
			}
		}
		res = (res < 0) ? 0 : res;
		System.out.println(res);
	}
	
	private static boolean isSomeMinus(int[] nums) {
		for (int num: nums) {
			if (num < 0) {
				return true;
			}
		}
		return false;
	}
	
	private static int findMinmalIndex(int[] nums) {
		int idx = -1;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
				idx = i;
			}
		}
		
		return idx;
	}
	
	private static long sumOfArray(int[] nums) {
		long res = 0;
		for (int num: nums) {
			res += num;
		}
		return res;
	}
	private static void a() {
		FastReader sc = new FastReader();
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = (a+b) / 2.0;
		
		if (c - (int)c == 0) {
			System.out.println((int)c);
		} else {
			System.out.println((int)c + 1);
		}
	}
	
	private static void b() {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		
		if (n == 1 || n == 2) {
			System.out.println("0");
			System.exit(0);
		}
		
		int[] dp = new int[n];
		dp[2] = 1;
		
		for (int i = 3; i < n; i++) {
			dp[i] = (dp[i - 3] % MOD + dp[i - 2] % MOD + dp[i - 1] % MOD) % MOD;
		}
		System.out.println(dp[n-1]);
	}
	
	private static void c() {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int res = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for (int key: map.keySet()) {
			int v = map.get(key);
			
			if (v > key) {
				res += (v - key);
			} else if (v < key) {
				res += v;
			}
		}
		
		System.out.println(res);
	}
	
	static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try{ 
                str = br.readLine(); 
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
