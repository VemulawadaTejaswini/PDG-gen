import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    long q, h, s, d;
    long n;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        q = sc.nextLong();
        h = sc.nextLong();
        s = sc.nextLong();
        d = sc.nextLong();
        n = sc.nextLong();
    }

    private void solve() {
        n *= 4;
        Pair[] ps = new Pair[4];
        ps[0] = new Pair(q, 1);
        ps[1] = new Pair(h, 2);
        ps[2] = new Pair(s, 4);
        ps[3] = new Pair(d, 8);
        Arrays.sort(ps);
        long ans = 0L;
        for (int i = 0; i < 4 && n > 0; i++) {
            long tmp = n / ps[i].snd;
            n %= ps[i].snd;
            ans += (tmp * ps[i].fst);
        }
        System.out.println(ans);
    }

    private class Pair implements Comparable<Pair>{
        long fst, snd;
        Pair(long f, long s) {
            fst = f;
            snd = s;
        }

        @Override
        public int compareTo(Pair pair) {
            return Double.compare((double)fst / snd, (double)pair.fst/pair.snd);
        }
    }
}
