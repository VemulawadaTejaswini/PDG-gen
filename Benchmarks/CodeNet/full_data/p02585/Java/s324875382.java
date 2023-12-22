import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int K = sc.ni();
		int[] next = new int[N];
		for (int i = 0; i < N; i++)
			next[i] = sc.ni()-1;
		long[] cost = new long[N];
		for (int i = 0; i < N; i++)
			cost[i] = sc.nl();
		
		long[][] price = new long[N][N+1];
		long[][] cycle = new long[N][2];
		for (int i = 0; i < N; i++) {
			int cur = i;
			long p = 0;
			int c = 0;
			while (true) {
				cur = next[cur];
				p += cost[cur];
				c++;
				price[i][c] = p;
				
				if (cur==i) {
					cycle[i] = new long[] {p,c};
					break;
				}
			}
		}
		//pw.println(Arrays.deepToString(cycle));
		long ans = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= Math.min(K,cycle[i][1]); j++) {
				long val = price[i][j];
				if (cycle[i][0]>0)
					val += cycle[i][0]*((K-j)/cycle[i][1]);
				ans = Math.max(ans,val);
			}
		}
		pw.println(ans);
		pw.close();
	}
	
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
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
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}