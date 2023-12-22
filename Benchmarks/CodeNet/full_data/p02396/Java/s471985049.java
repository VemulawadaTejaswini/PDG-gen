import java.io.*;
import java.util.*;

// Solution class
class Solution {
    public Solution() { }
    private static final InputReader scan = new InputReader();
    // solve method
    public void solve() throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        // code goes here...
        boolean bool = true;
        int c = 0;
        while (bool) {
			int x = scan.nextInt();
			if (x != 0) {
				c++;
				out.println("Case " + c + ": " + x);
			} else {
				bool = false;
			}
		}

        out.close();
    }
}

// InputReader class
class InputReader {
    private final BufferedReader br;
    private StringTokenizer st = new StringTokenizer("");
    public InputReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
    public boolean hasNext() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                String line = br.readLine();
                if (line == null)  return false;
                st = new StringTokenizer(line);
            } catch (IOException ie) { throw new RuntimeException(ie); }
        }
        return true;
    }
    public String next() throws IOException {
        while (!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException ie) { ie.printStackTrace(); }
        }
        return st.nextToken();
    }
    public String nextLine() throws IOException {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException ie) { ie.printStackTrace(); }
        return str;
    }
    public double nextDouble() throws IOException { return Double.parseDouble(next()); }
    public int nextInt() throws IOException { return Integer.parseInt(next()); }
    public long nextLong() throws IOException { return Long.parseLong(next()); }
}

// Main class
public class Main {
    public Main() { }
    // driver method
    public static void main(String[] args) throws IOException {
        new Solution().solve();
    }
}

