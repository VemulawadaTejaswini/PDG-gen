import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int A = sc.ni();
		int B = sc.ni();
		int C = sc.ni();
		int K = sc.ni();
		for (int a = 0; a <= K; a++) {
			for (int b = 0; b <= K-a; b++) {
				for (int c = 0; c <= K-a-b; c++) {
					int X = A*(1<<a);
					int Y = B*(1<<b);
					int Z = C*(1<<c);
					if (X < Y && Y < Z) {
						pw.println("Yes");
						pw.close();
						return;
					}
				}
			}
		}
		pw.println("No");
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