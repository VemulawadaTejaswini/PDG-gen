import java.io.*;
import java.util.*;

public class Main {
    class Frac {
        public int a, b;

        public Frac(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int gcd(int a, int b) {
            if (b == 0) return a;
            return gcd(b, a % b);
        }

        public void fix() {
            int gcd_ = gcd(a, b);
            a /= gcd_;
            b /= gcd_;
        }

        public void add(Frac frac) {
            int base = this.b / gcd(this.b, frac.b) * frac.b;
            int child = this.a * (base / this.b) + frac.a * (base / frac.b);
            this.b = base;
            this.a = child;
            fix();
        }

        public void sub(Frac frac) {
            add(new Frac(-frac.a, frac.b));
        }


    }

    void run() {
        while (true) {
            String s = read();
            if (s.equals("#")) {
                break;
            }
            String t = s;
            ArrayList<Integer> dir = new ArrayList<Integer>();
            while (true) {
                if (t.startsWith("north")) {
                    dir.add(0);
                    t = t.substring(5);
                }
                if (t.startsWith("west")) {
                    dir.add(1);
                    t = t.substring(4);
                }
                if (t.isEmpty()) break;
            }
            Collections.reverse(dir);
//            sysout.println(Arrays.toString(dir.toArray()));
            Frac frac = null;
            if (dir.get(0) == 0) frac = new Frac(0, 1);
            if (dir.get(0) == 1) frac = new Frac(90, 1);
            for (int i = 1; i < dir.size(); i++) {
                if (dir.get(i) == 0) {
                    frac.sub(new Frac(90, (int) Math.pow(2, i)));
                }
                if (dir.get(i) == 1) {
                    frac.add(new Frac(90, (int) Math.pow(2, i)));
                }
            }
            if (frac.b == 1) sysout.println(frac.a);
            else sysout.println(frac.a + "/" + frac.b);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = new StringTokenizer("");

    String read() {
        if (!buffer.hasMoreTokens()) {
            try {
                buffer = new StringTokenizer(in.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }

    String readLine() {
        buffer = new StringTokenizer("");
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}