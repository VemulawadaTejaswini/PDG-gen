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
		int x = sc.nI();

		int[] a = new int[N];
		long sum = 0;
		for(int i = 0; i<N; i++) {
			a[i] = sc.nI();
			sum+= a[i];
		}
		while(true) {
			long diff = 0;
			int newa[] = new int[N];
			for(int i = 0; i<N; i++) {
				int prev = (i + N - 1)%N;
				if(a[i] > a[prev]) {
					diff += a[i] - a[prev];
					newa[i] = a[prev];
				} else {
					newa[i] = a[i];
				}
			}
			if(diff>x) {
				sum -= diff - x;
				a = newa;
			} else {
				break;
			}
		}
		System.out.println(sum);
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