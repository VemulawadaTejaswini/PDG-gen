import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    static class HourGrass {

        int a;
        int b;

        public HourGrass(int a, int X) {
            this.a = a;
            b = X - a;
//            System.out.println("Init " + a + "\t" + b);
        }

        boolean aIsUp = true;

        void flip() {
//            System.out.println("Flip " + a + "\t" + b);
            aIsUp = !aIsUp;
        }

        void tick() {
            if (aIsUp) {
                if (a > 0) {
                    a--;
                    b++;
                }
            } else {
                if (b > 0) {
                    b--;
                    a++;
                }
            }
        }

        void move(int ammount) {
//            System.out.println("Move " + ammount + "\t" + a + "\t" + b);
            if (aIsUp) {
                if (ammount > a) {
                    b += a;
                    a = 0;
                } else {
                    a -= ammount;
                    b += ammount;
                }
            } else {
                if (ammount > b) {
                    a += b;
                    b = 0;
                } else {
                    b -= ammount;
                    a += ammount;
                }
            }
        }

        int sandRemain() {
            return aIsUp ? a : b;
        }

    }

    public static void main(String[] args) throws Throwable {
        InputStream is = null;
        if (false) {
            String input = "100\n"
                + "5\n"
                + "48 141 231 314 425\n"
                + "7\n"
                + "0 19\n"
                + "50 98\n"
                + "143 30\n"
                + "231 55\n"
                + "342 0\n"
                + "365 100\n"
                + "600 10";
            is = new ByteArrayInputStream(input.getBytes());
        } else {
            is = System.in;
        }
        try (BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
            int X = readInt(r);
            int K = readInt(r);
            int[] rs = readInts(r);
            int Q = readInt(r);

            for (int i = 0; i < Q; i++) {
                int[] read = readInts(r);
                int t = read[0];
                int a = read[1];

                HourGrass hg = new HourGrass(a, X);
                int rIndex = 0;
                int now = 0;
                while (true) {
                    int nextR = rIndex < rs.length ? rs[rIndex] : Integer.MAX_VALUE;
                    if (nextR < t) {
                        hg.move(nextR - now);
                        now = nextR;
                        rIndex++;
                        hg.flip();
                    } else {
                        hg.move(t - now);
                        break;
                    }
                }
                System.out.println(hg.a);
            }
        }
    }

    private static int readInt(BufferedReader r) throws IOException {
        return Integer.parseInt(r.readLine());
    }

    private static int[] readInts(BufferedReader r) throws IOException {
        String[] data = r.readLine().split("\\s");
        int[] vals = new int[data.length];
        for (int i = 0; i < vals.length; i++) {
            vals[i] = Integer.parseInt(data[i]);
        }
        return vals;
    }

}
