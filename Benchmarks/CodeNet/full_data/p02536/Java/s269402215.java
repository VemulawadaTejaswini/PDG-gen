import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	FastScanner fs = new FastScanner();
    	int n = fs.nextInt();
    	int m = fs.nextInt();
    	int origm = m;
    	while(origm-->0) {
    		int a = fs.nextInt();
    		int b = fs.nextInt();
    	}
    	int f = n-m;
    	System.out.println(f-1);
    }
    
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
