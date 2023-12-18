import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    Random rand = new Random();


    public void solve() throws IOException {
        int n = nextInt();
        int cnt = 1;
        while(cnt <= n){
            cnt *= 2;
        }
        out.print(cnt >> 1);

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
}