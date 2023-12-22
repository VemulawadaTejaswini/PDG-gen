import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long inv2 =1;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        out.println(main.solve());
        out.flush();
    }
    void solve() throws IOException {
        char[] ss = sc.next().toCharArray();
        for(int i=0; i<ss.length; i++){
            if(ss[i]=='?') ss[i] = 'D';
        }
        out.println(new String(ss));
    }
}