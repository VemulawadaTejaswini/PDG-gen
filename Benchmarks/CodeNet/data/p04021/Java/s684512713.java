import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
public class Main {
	public static void main(String args[]) {
		Sc sc = new Sc(System.in);
		int N = sc.nI();
		int table[] = new int[N];
		int orgtab[] = new int[N];
		int parity = 0;
		for(int i = 0; i<N; i++) {
			table[i] = sc.nI();
			orgtab[i] = table[i];
		}

		Arrays.sort(table);
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<N; i++) {
			map.put(table[i],i);
		}

		for(int i = 0; i<N; i+=2) {
			int a = (map.get(orgtab[i])+i)%2;
			parity += a;
		}
		System.out.println(parity);
	}
}

class Sc {
    public Sc(InputStream i) {
        r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasM() {
        return peekToken() != null;
    }

    public int nI() {
        return Integer.parseInt(nextToken());
    }

    public double nD() { 
        return Double.parseDouble(nextToken());
    }

    public long nL() {
        return Long.parseLong(nextToken());
    }

    public String n() {
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
}