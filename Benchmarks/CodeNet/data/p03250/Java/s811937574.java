import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
 
class Main {
    
    public static void main(String[] args) throws IOException {
    	int n = in.nextInt() + 1;
    	int m = in.nextInt() + 1;
    	int[] x = new int[n];
    	x[0] = in.nextInt();
    	int[] y = new int[m];
    	y[0] = in.nextInt();
    	for(int i = 1; i < n; i ++)
    		x[i] = in.nextInt();
    	for(int i = 1; i < m; i ++)
    		y[i] = in.nextInt();
    	Arrays.sort(x);
    	Arrays.sort(y);
    	if(y[0] > x[n - 1])
    		sop("No War");
    	else
    		sop("War");
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
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        char nextChar() {
            return in.next().charAt(0);
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static FastReader in = new FastReader();
    static OutputStream out = new BufferedOutputStream(System.out);
    
    public static byte[] toByte(Object o) {
        return String.valueOf(o).getBytes();
    }
    
    public static void sop(Object o) {
        System.out.print(o);
    }
} 