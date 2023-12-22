import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD1 = 1000000007L;
	static final long MOD2 = 1000000009L;
	static final long BASE = 31L;
	
	static final int INF = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		String[] strs = new String[N];
		boolean[][][] contains = new boolean[N][][];
		for (int i = 0; i < N; i++) {
			strs[i] = sc.next();
			int M = strs[i].length();
			contains[i] = new boolean[M][26];
			for (int j = 0; j < M; j++) {
				contains[i][j][strs[i].charAt(j)-'a'] = true;
				if (j==0)continue;
				for (int k = 0; k < 26; k++) {
					contains[i][j][k] |= contains[i][j-1][k];
				}
			}
		}
		
		HashSet<Long> hashes = new HashSet<Long>();
		for (String s: strs) {
			int M = s.length();
			long h1 = 0;
			long h2 = 0;
			long pow1 = 1;
			long pow2 = 1;
			for (int i = M-1; i >= 0; i--) {
				h1 = (h1+pow1*(s.charAt(i)-'a'+1))%MOD1;
				h2 = (h2+pow2*(s.charAt(i)-'a'+1))%MOD2;
				pow1 = (pow1*BASE)%MOD1;
				pow2 = (pow2*BASE)%MOD2;
			}
			long hash = MOD2*h1+h2;
			hashes.add(hash);
		}

		long ans = 0;
		for (int a = 0; a < N; a++) {
			String s = strs[a];
			int M = s.length();
			long h1 = 0;
			long h2 = 0;
			long pow1 = 1;
			long pow2 = 1;
			for (int i = M; i >= 1; i--) {
				if (i < M) {
					h1 = (h1+pow1*(s.charAt(i)-'a'+1))%MOD1;
					h2 = (h2+pow2*(s.charAt(i)-'a'+1))%MOD2;
					pow1 = (pow1*BASE)%MOD1;
					pow2 = (pow2*BASE)%MOD2;
				}

				long hash = MOD2*h1+h2;
				for (int j = 0; j < 26; j++) {
					if (contains[a][i-1][j]) {
						long h1C = (h1+pow1*(j+1))%MOD1;
						long h2C = (h2+pow2*(j+1))%MOD2;
						long hashC = MOD2*h1C+h2C;
						if (hashes.contains(hashC)) {
							ans++;
						}
					}
				}
			}
		}
		pw.println(ans-N);
		
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