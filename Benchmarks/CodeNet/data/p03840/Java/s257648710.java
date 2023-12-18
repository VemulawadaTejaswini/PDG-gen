import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
    static int MOD = 1000000007;

    void solve() throws IOException {

    	int I, O, J, L;

    	I = ni();
    	O = ni();
    	ni();
    	J = ni();
    	L = ni();
    	ni();
    	ni();

    	long ans = 0;

    	if(I+O+J+L == 0){
    		out.println(ans);
    		return;
    	}

    	ans += O * 2;

    	int min = I;
    	if(min > J) min = J;
    	if(min > L) min = L;

    	if(I%2==0 && J%2==1 && L%2==1 || I%2==1 && J%2==0 && L%2==0){
    		if(min != 0){
    			min--;
    			ans += 6 * min;
    	    	I -= min;
    	    	J -= min;
    	    	L -= min;
    		}
    	}else{
    		ans += 6 * min;
	    	I -= min;
	    	J -= min;
	    	L -= min;
    	}



    	ans += 4 * (I / 2);
    	ans += 4 * (L / 2);
    	ans += 4 * (J / 2);

    	out.println(ans / 2);

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

    int k(int n) throws IOException {
        if(n == 0) return 1;
        else return n * k(n-1);
    }

    long s(int a, int n) throws IOException {
        return (a+n) * (n-a+1) / 2;
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