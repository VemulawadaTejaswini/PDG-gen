import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        int[] type = new int[4];
        for (int i = 0; i < N; i++) {
        	String s = sc.next();
        	if (s.equals("AC")) {
        		type[0] += 1;
        	} else if (s.equals("WA")) {
        		type[1] += 1;
        	} else if (s.equals("TLE")) {
        		type[2] += 1;
        	} else {
        		type[3] += 1;
        	}
        }
        
        pw.println("AC x " + type[0]);
        pw.println("WA x " + type[1]);
        pw.println("TLE x " + type[2]);
        pw.println("RE x " + type[3]);
        
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
                } catch (IOException e) {
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