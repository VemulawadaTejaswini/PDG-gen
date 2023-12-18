
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class Main {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public Main() {
        this(System.in, System.out);
    }

    public Main(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }
    int N;
    int[] ar;

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        N = sc.nextInt();
        String s = sc.next();
        ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = s.charAt(i) - '1';
        }



        out.println(uso());
        out.flush();
    }

    int uso() {
        ArrayList<Integer> x = new ArrayList<>();
        for (int a : ar) x.add(a);
//        debug(x);

        while (x.size() > 1) {
            ArrayList<Integer> next = new ArrayList<>();
            int s = x.get(0);
            int size = x.size();
            for (int i = 1; i < size; i++) {
                if (s != x.get(i)) {
                    next.add(Math.abs(s - x.get(i)));
                } else {
                    while (i < size && s == x.get(i)) i++;
                    next.add(0);
                    i--;
                }
                s = x.get(i);
            }
            x = next;
//            debug(x);
        }
        return x.get(0);
    }

    int solve() {
        int[] s = new int[N];
        System.arraycopy(ar, 0, s, 0, N);
        for (int i = 1; i < N; i++) {
            debug(s);
            int[] next = new int[N - i];
            for (int j = 0; j < N - i; j++) {
                next[j] = Math.abs(s[j] - s[j + 1]);
            }
            s = next;
        }
        debug(s[0]);
        return s[0];
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}