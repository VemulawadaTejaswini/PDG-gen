import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
    	String S = ns();
    	int[] cnt = new int[4];

    	for (int i=0; i<S.length(); i++) {
    		switch(S.charAt(i)) {
    		case 'N':
    			cnt[0]++;
    			break;
    		case 'W':
    			cnt[1]++;
    			break;
    		case 'E':
    			cnt[2]++;
    			break;
    		case 'S':
    			cnt[3]++;
    			break;
    		}
    	}

    	if (cnt[0] == 0 && cnt[3] != 0
    			|| cnt[0] != 0 && cnt[3] == 0
    			|| cnt[1] == 0 && cnt[2] != 0
    			|| cnt[1] != 0 && cnt[2] == 0) {
    		out.println("No");
    	} else {
    		out.println("Yes");
    	}
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}
