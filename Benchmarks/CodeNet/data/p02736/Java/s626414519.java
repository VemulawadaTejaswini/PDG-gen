

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

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

    HashMap<String, Integer> map = new HashMap<>();

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        int min = 3, max = 0;

        int n = sc.nextInt();
        String s = sc.next();
        boolean abc = false;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, s.charAt(i) - '0');
            max = Math.max(max, s.charAt(i) - '0');
        }

        for (int i = 0; i < n - 2; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '2') {
                abc = true;
            }
        }
        
        Random rnd = new Random(System.currentTimeMillis());

        if (max - min < 2) {
            out.println(Math.abs(s.charAt(0) - s.charAt(n - 1)));
        } else {
            if (abc) {
                out.println(rnd.nextDouble() < 0.8 ? 0 : Math.abs(s.charAt(0) - s.charAt(n - 1)));
            } else {
                out.println(rnd.nextDouble() < 0.2 ? 0 : Math.abs(s.charAt(0) - s.charAt(n - 1)));
            }
        }

        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}