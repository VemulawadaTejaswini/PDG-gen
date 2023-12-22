package cp1;
import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prem_cse
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solver = new Solution();
        solver.solve(1, in, out);
        out.close();
    }

    static class Solution{
  
    	
        public void solve(int testNumber, FastReader sc, PrintWriter out) {
        
        	int n = sc.nextInt();
        	
        	int[] l = new int[n];
        	for(int i=0;i<n;++i) l[i] = sc.nextInt();
        	int ans = 0;
        	for(int i=0;i<n;++i) {
        		for(int j=i+1;j<n;++j) {
        			for(int k=j+1;k<n;++k) {
        				int a = l[i];
        				int b = l[j];
        				int c = l[k];
        				if(a!=b && b!=c && a!= c) {
        					if(a+b > c && a+c > b && b+c > a) ++ans;
        				}
        			}
        		}
        	}
        	out.print(ans);
        }

	
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new
                    InputStreamReader(stream), 32768);
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

