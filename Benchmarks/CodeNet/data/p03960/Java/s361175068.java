import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
public class Main {
    static int M[][];
    static int H;
    static String a;
    static String b;
    public static void main(String args[]) {
        Sc sc = new Sc(System.in);
        H = sc.nI();
        int W = sc.nI();
        if(W > 3) return;

        String[] B = new String[H];
        for(int i = 0; i<H; i++) {
            B[i] = sc.n();
        }
        M = new int[H+1][H+1];
        for(int i = 0; i<=H; i++) {
            for(int j = 0; j<=H; j++) {
                M[i][j] = -1;
            }
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        
        for(int i = 0; i<H; i++) {
            sb1.append(B[i].charAt(0));
            sb2.append(B[i].charAt(1));
            if(W== 3) sb3.append(B[i].charAt(2));
        }
        a = sb1.toString();
        b = sb2.toString();
        int l = opt(H, H);
        if(W==3) {
            a = sb3.toString();
            for(int i = 0; i<=H; i++) {
                for(int j = 0; j<=H; j++) {
                    M[i][j] = -1;
                }
            }
            l += opt(H, H);
        }
        System.out.println(l);
    }
    public static int opt(int l, int r) {
        if(l== 0 || r == 0) return 0;
        if(l<H && r < H && M[l][r] != -1) return M[l][r];
        int sum = 0;
        if(r > l) {
            for(int i = 0; i<Math.min(l, r); i++) {
                if(a.charAt(i) == b.charAt(i+r-l)) sum++;
            }
        } else {
            for(int i = 0; i<Math.min(l, r); i++) {
                if(a.charAt(i + l - r) == b.charAt(i)) sum++;
            }
        }
        M[l][r] = sum + Math.min(opt(l-1,r), opt(l, r-1));
        return M[l][r];
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