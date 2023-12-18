import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.next().toCharArray();
        char[] brr = in.next().toCharArray();

        TreeSet<Integer>[] idx = new TreeSet[26];
        for (int i = 0; i < 26; ++i)
            idx[i] = new TreeSet<>();

        for (int i = 0; i < arr.length; ++i) {
            idx[arr[i] - 'a'].add(i + 1);
        }

        int cur = -1;

        long ans = 0;
        for (int i = 0; i < brr.length; ++i) {
            if (idx[brr[i] -'a'].size() == 0) {
                System.out.println(-1);
                return ;
            }
            
            Integer ceilingInteger = idx[brr[i] - 'a'].ceiling(cur);
            if (ceilingInteger == null) ceilingInteger = idx[brr[i] - 'a'].first();
            if (cur >= ceilingInteger) {
                ceilingInteger = idx[brr[i] - 'a'].first();
                ans += arr.length;
            }

            cur = ceilingInteger;
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