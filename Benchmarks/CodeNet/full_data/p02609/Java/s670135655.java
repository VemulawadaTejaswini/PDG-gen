import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	static final int INF = 50000000;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		String s = sc.next();
		int one = 0;
		for (char c: s.toCharArray()) {
			if(c=='1')one++;
		}
		long remP = 0;
		long remN = 0;
		for (int i = N-1; i >= 0; i--) {
			int x = s.charAt(i)-'0';
			if (one > 1)
				remP = (remP+x*power(2,N-1-i,one-1))%(one-1);
			remN = (remN+x*power(2,N-1-i,one+1))%(one+1);
		}
		
		for (int i = 0; i < N; i++) {
			long rem;
			if (s.charAt(i)=='0') {
				rem = (remN+power(2,N-1-i,one+1))%(one+1);
			} else {
				if (one == 1) {
					pw.println(0);
					continue;
				}
				rem = ((one-1)+remP-power(2,N-1-i,one-1))%(one-1);
			}
			int ans = 1+op(rem);
			pw.println(ans);
		}
		pw.close();
	}
	
	public static int op(long n) {
		if (n==0)
			return 0;
		else
			return 1+op(n%Long.bitCount(n));
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) {
		long ans = 1;
		x %= m;
		while (y > 0) {
			if(y % 2 == 1)
				ans = (ans * x) % m;
			y /= 2;
			x = (x * x) % m;
		}
		return ans;
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