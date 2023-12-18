import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 081
	// https://atcoder.jp/contests/abc081/tasks
	final static int MOD = 10007;
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] balls = new long[200001];
		long res = 0;
		
		// 先計算數量
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			balls[num]++;
		}
		
		// 排序，有球者將由小排到大
		// [0, ...., 1, 2, 2]
		Arrays.sort(balls);
		
		// 從後面數K個是應該存在的，其他都是應該砍掉的
		for (int i = 0; i < 200001 - k; i++) {
			res += balls[i];
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
