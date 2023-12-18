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
        long[] T = new long[N];
        long[] A = new long[N];
        long maxh = 0;
        int iT = -1;
        int iA = -1;
        for(int i = 0; i<N; i++) {
            T[i] = sc.nI();
            if(T[i] > maxh) {
                maxh = T[i];
                iT = i;
            }
        }
        for(int i = 0; i<N; i++) {
            A[i] = sc.nI();
            if(iA != -1) continue;
            if(A[i]<maxh) {
                iA = i-1;
            }
        }
        if(A[0] != maxh || iT > iA) {
            System.out.println(0);
            return;
        }
        long ways = 1;
        for(int i = 1; i<iT; i++) {
            if(T[i] == T[i-1]) {
                ways = (ways*T[i])%1000000007L;
            }
        }
        for(int i = N-2; i>iA; i--) {
            if(A[i] == A[i+1]) {
                ways = (ways*A[i])%1000000007L;
            }
        }
        for(int i = iT+1; i<iA; i++) {
            ways = (ways*maxh)%1000000007L;
        }
        System.out.println(ways);
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