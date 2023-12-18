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
		String st = sc.n();
		boolean n = false;
		boolean e = false;
		boolean s = false;
		boolean w = false;
		for(int i = 0; i<st.length(); i++) {
			if(st.charAt(i) == 'N') n = true;
			if(st.charAt(i) == 'W') w = true;
			if(st.charAt(i) == 'E') e = true;
			if(st.charAt(i) == 'S') s = true;
		}
		boolean ok = (s == n) && (w == e);
		if(ok) System.out.println("Yes");
		else System.out.println("No");
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