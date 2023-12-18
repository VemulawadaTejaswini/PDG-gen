import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
public class Main {
	public static void main(String args[]) {
		Sc sc = new Sc(System.in);
		int N = sc.nI();
		int x[] = new int[N+1];
		x[0] = 0;
		for(int i = 1; i<=N; i++) {
			x[i] = sc.nI();
		}
		int L = sc.nI();
		int Q = sc.nI();
		StringBuilder sb = new StringBuilder();
		for(int q = 0; q<Q; q++) {
			int a = sc.nI();
			int b = sc.nI();
			int s = Math.min(a,b);
			int e = Math.max(a,b);
			int days = 1;
			int left = L;
			for(int i = s; i<e; i++) {
				int dist = x[i+1] - x[i];
				if(left<dist) {
					left = L - dist;
					days++;
				} else {
					left -= dist;
				}
			}
			sb.append(days);
			sb.append('\n');
		}
		System.out.print(sb);
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