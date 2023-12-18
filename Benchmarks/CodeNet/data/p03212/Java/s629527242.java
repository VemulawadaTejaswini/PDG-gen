
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 114
	// https://atcoder.jp/contests/abc114/tasks
	static long n;
	static int count = 0;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		n = sc.nextLong();
		dfs(3, true, false, false);
		dfs(5, false, true, false);
		dfs(7, false, false, true);
		System.out.println(count);
	}
	
	private static void dfs(long num, boolean san, boolean go, boolean nana) {
		if (num > n) { return ; }
		dfs(num * 10 + 3, true, go, nana);
		dfs(num * 10 + 5, san, true, nana);
		dfs(num * 10 + 7, san, go, true);
		
		if (san && go && nana) {
			count++;
		}
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
