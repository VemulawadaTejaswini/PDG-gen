import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        int k = pint();
        int s = 1<<n;
        int mi = Integer.MAX_VALUE;
        for(int i=0;i<s;i++) {
            int v = 1;
            for(int j=0;j<n;j++) {
                if((i&(1<<j)) > 0) {
                    v *= 2;
                } else {
                    v += k;
                }
            }
            mi = min(mi, v);
        }
        out(mi);
    }

    private int pint() throws IOException {
        return pint(rd.readLine());
    }

    private int pint(String s) {
        return Integer.parseInt(s);
    }

    private static void out(Object x) {
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}
