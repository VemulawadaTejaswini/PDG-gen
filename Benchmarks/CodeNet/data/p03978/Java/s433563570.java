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
    	ni();
    	String q1 = "";
    	String q2 = "";

    	int state = 0;
    	int mode = 1;

    	for (int i=0; i<420; i++) {
    		int x = state / 2;
    		int y = state % 2;

    		out.println(mode == 1 ? q1 + (x == 0 ? "." : "#") : (x == 0 ? "." : "#") + q1);
    		out.println(mode == 1 ? q2 + (y == 0 ? "." : "#") : (y == 0 ? "." : "#") + q2);
    		out.flush();

    		String s = ns();

    		if (s.equals("end")) {
    			return;
    		} else if (s.equals("T")) {
    			q1 = mode == 1 ? q1 + (x == 0 ? "." : "#") : (x == 0 ? "." : "#") + q1;
    			q2 = mode == 1 ? q2 + (y == 0 ? "." : "#") : (y == 0 ? "." : "#") + q2;
    			state = 0;
    		} else {
    			state++;
    			if (state == 4) {
    				mode = 2;
    				state = 0;
    			}
    		}
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
