import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 128
	// https://atcoder.jp/contests/abc128/tasks
	final static int MOD = 10007;
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] nums = new int[n];
		int evenCnt = 0;
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
			if (nums[i] % 2 == 0) {
				evenCnt++;
			}
		}
		
		while (evenCnt == n) {
			res++;
			evenCnt = 0;
			for (int i = 0; i < n; i++) {
				int newNum = nums[i] / 2;
				nums[i] = newNum;
				if (newNum % 2 == 0) {
					evenCnt++;
				}
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
