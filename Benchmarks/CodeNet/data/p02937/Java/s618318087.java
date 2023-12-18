import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.next().toCharArray();
        char[] brr = in.next().toCharArray();

        int[] idx = new int[26];
        Arrays.fill(idx, Integer.MAX_VALUE);
        for (int i = 0; i < arr.length; ++i) {
            idx[arr[i] - 'a'] = Math.min(idx[arr[i] - 'a'], i + 1);
        }

        int cur = -1;

        long ans = 0;
        for (int i = 0; i < brr.length; ++i) {
            int next = idx[brr[i] - 'a'];
            if (next == Integer.MAX_VALUE) {
                System.out.println(-1);
                return;
            }

            // System.err.println(cur + " " + next);
            if (cur > next) {
                ans += arr.length;
            }
            cur = next;
        }

        ans += cur;
        System.out.println(ans);
    }
}


class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
	super(new BufferedOutputStream(System.out));
	r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
	super(new BufferedOutputStream(o));
	r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
	return peekToken() != null;
    }

    public int getInt() {
	return Integer.parseInt(nextToken());
    }

    public double getDouble() { 
	return Double.parseDouble(nextToken());
    }

    public long getLong() {
	return Long.parseLong(nextToken());
    }

    public String getWord() {
	return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
	if (token == null) 
	    try {
		while (st == null || !st.hasMoreTokens()) {
		    line = r.readLine();
		    if (line == null) return null;
		    st = new StringTokenizer(line);
		}
		token = st.nextToken();
	    } catch (IOException e) { }
	return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }

    public int nextInt() {
        return Integer.parseInt(getWord());
    }

}