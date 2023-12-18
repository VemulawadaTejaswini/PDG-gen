import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    BufferedReader rd;

    Main() throws IOException {
        rd = new BufferedReader(new InputStreamReader(System.in));
        compute();
    }

    private void compute() throws IOException {
        int n = pint();
        long[] cnt = new long[200];
        for(int i=0;i<n;i++) {
            String s = rd.readLine();
            cnt[s.charAt(0)]++;
        }
        char[] d = "MARCH".toCharArray();
        long res = 0;
        for(int i=0;i<32;i++) {
            if(Integer.bitCount(i) == 3) {
                int u = 1;
                char[] chosen = new char[3];
                int ic = 0;
                for(int k=0;k<5;k++) {
                    if((i&u)>=1) {
                        chosen[ic] = d[k];
                        ic++;
                    }
                    u <<= 1;
                }
                res += cnt[chosen[0]] * cnt[chosen[1]] * cnt[chosen[2]];
            }
        }
        out(res);
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
