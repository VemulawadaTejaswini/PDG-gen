import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
        BigInteger n, m;
        line = br.readLine();
//        System.err.println(line);
        st = new StringTokenizer(line);
        n = new BigInteger(st.nextToken());
        m = new BigInteger(st.nextToken());
        Pair p[] = new Pair[n.intValue()];
        for (int i = 0; i < n.intValue(); i++) {
            line = br.readLine();
//            System.err.println(line);
            st = new StringTokenizer(line);
            p[i] = new Pair();
            p[i].a = new BigInteger(st.nextToken());
//            System.err.println(p[i].a);
            p[i].b = new BigInteger(st.nextToken());
//            System.err.println(p[i].b);
        }
        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.a.subtract(o2.a).signum();
            }
        });
//        for (int i = 0; i < n.intValue(); i++) {
//            System.err.println(p[i].a + " " + p[i].b);
//        }
        BigInteger cur = BigInteger.ZERO, res = BigInteger.ZERO;
        int i = 0;
        while (!cur.equals(m)) {
            BigInteger mn = m.subtract(cur);
            BigInteger x = p[i].b;
            if (x.subtract(mn).signum() < 0) {
                mn = x;
            }
            cur = cur.add(mn);
            res = res.add(mn.multiply(p[i].a));
            i++;
        }
        System.out.println(res);
    }
}

class Pair {
    BigInteger a, b;


}
