
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 121
	// https://atcoder.jp/contests/abc121/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long res = 0;
		int[][] stores = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			stores[i][0] = sc.nextInt();
			stores[i][1] = sc.nextInt();
		}
		
		Arrays.sort(stores, (a , b) -> (a[0] - b[0]));
		
		for (int i = 0; i < n; i++) {
			long buy = Math.min(m, stores[i][1]);
			res += (long)(buy * stores[i][0]);
			m -= (int)buy;
			if (m == 0) { break; }
		}
		System.out.println(res);
	}
	
	// A smarted method of task 3
	private void c2() {
		FastReader sc = new FastReader();
		String s = sc.next();
		LinkedList<Integer> stack = new LinkedList<>();
		int res = 0;
		int cnt0 = 0;
		int cnt1 = 0;
		
		for (char c: s.toCharArray()) {
			int code = c - '0';
			if (code == 0) {
				cnt0++;
			} else {
				cnt1++;
			}
		}
		
		System.out.println(2*Math.min(cnt0, cnt1));
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
