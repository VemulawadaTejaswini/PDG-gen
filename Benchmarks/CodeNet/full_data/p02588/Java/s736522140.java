import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	//static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		long[][] cnt = new long[30][55];
		int ints = 0;
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			
			int ind = s.indexOf(".");
			if (ind==-1) {
				s += ".0";
				ind = s.indexOf(".");
			}
			int M = s.length();
			String str = s.substring(0,ind);
			if (ind < M)
				str += s.substring(ind+1,M);
			long num = Long.parseLong(str);
			int[] pow = new int[2];
			pow[0] = (ind-M+1);
			pow[1] = (ind-M+1);
			while (num % 2 == 0) {
				pow[0] += 1;
				num /= 2;
			}
			while (num % 5 == 0) {
				pow[1] += 1;
				num /= 5;
			}
			if (pow[0] >= 0 && pow[1] >= 0)
				ints += 1;
			cnt[pow[0]+9][pow[1]+9] += 1;
		}
		
		long ans = 0;

		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[0].length; j++) {
				for (int a = Math.max(18-i,0); a < cnt.length; a++) {
					for (int b = Math.max(18-j,0); b < cnt[1].length; b++) {
						ans += cnt[i][j]*cnt[a][b];
					}
				}
			}
		}
		ans = (ans-ints)/2;
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