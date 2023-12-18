import java.io.*;
import java.util.*;

public class Main {
    static long mod = (int)Math.pow(10,9)+7;
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int level = 1;
		boolean is1 = false;
		int tmp = n;
		while(tmp != 1){
		    level++;
		    if(tmp % 2 != 0) is1 = true;
		    tmp >>= 1;
		}
		if(!is1)level--;
		//int[][] roads = new int[n][n];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
		    for(int j = i+1; j < n; j++){
		        for(int k = 0; k < level; k++){
		            if(((i >> k) % 2)+((j >> k) % 2) == 1){
		                sb.append((k+1) + " ");
		                break;
		            }
		        }
		    }
		    pw.println(sb.toString().trim());
		    sb.setLength(0);
		}
		pw.close();
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

