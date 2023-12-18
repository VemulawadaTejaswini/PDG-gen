import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] ret = Z_algorithm(s);
        int[] cnt = new int[s.length];
        int ans = 0;
        for(int i = 0; i < n; i++){
            char[] t = Arrays.copyOfRange(s,i,n);
            int[] lcp = Z_algorithm(t);
            for (int j = 0; j < t.length; j++) {
                int l = Math.min(lcp[j], j);
                ans = Math.max(ans, l);
            }
        }
        System.out.println(ans);
    }
    
    public static int[] Z_algorithm(char[] s) {
    	int c = 0, n = s.length;
        int[] ret = new int[n];
    	for (int i = 1; i < n; i++) {
    		int l = i - c;
    		if (i + ret[l] < c + ret[c]) {
    			ret[i] = ret[l];
    		}
    		else {
    			int j = Math.max(0, c + ret[c] - i);
    			while (i + j < n && s[j] == s[i+j])j++;
    			ret[i] = j;
    			c = i;
    		}
    	}
    	ret[0] = n;
    	return ret;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
