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
