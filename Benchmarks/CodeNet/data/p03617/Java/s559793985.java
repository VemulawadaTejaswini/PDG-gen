import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    

    public void solve() throws IOException {
        int q = nextInt(), h = nextInt(), s = nextInt(), d = nextInt();
        long n = nextInt();
        if(h > 2 * q){
            h = 2 * q;
        }
        if(s > 2 * h){
            s = 2 * h;
        }
        if(d > 2 * s){
            d = 2 * s;
        }
        long res = 0;
        if(d <= 2 * s){
            res += n / 2 * d;
            res += (n % 2) * s;
        }else{
            res = n * s;
        }
        out.print(res);
    }


    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("sum2.in"));
//            out = new PrintWriter(new File("sum2.out"));
            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}