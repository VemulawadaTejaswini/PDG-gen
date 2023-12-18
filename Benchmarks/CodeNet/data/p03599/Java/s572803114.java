import java.io.*;
import java.util.*;

public class Main {
    String fileName = "";


    public void solve() throws IOException {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();
        int d = nextInt();
        int e = nextInt();
        int f = nextInt();
        double max = 0;
        int sum = 0;
        int sug = 0;
        int lastsum = 1;
        for (int water1 = 0; water1 <= f; water1 += 100 * a) {
            for (int water2 = 0; water2 <= f; water2 += 100 * b) {
                for (int sugar1 = 0; sugar1 * (100 + e) <= (water1 + water2) * e; sugar1 += c) {
                    for (int sugar2 = 0; sugar2 * (100 + e) <= (water1 + water2) * e; sugar2 += d) {
                        if (water1 + water2 + sugar1 + sugar2 <= f
                                && (sugar1 + sugar2) * (100 + e) <= e * (water1 + water2 + sugar1 + sugar2)
                                && (sugar1 + sugar2) * 100 * lastsum > max * (water1 + water2 + sugar1 + sugar2)) {
                            max = (sugar1 + sugar2) * 100;
                            lastsum = water1 + water2 + sugar1 + sugar2;
                            sum = water1 + water2 + sugar1 + sugar2;
                            sug = sugar1 + sugar2;
                        }
                    }
                }
            }
        }
        if (sum == 0) {
            sum = a * 100;
        }
        out.println(sum + " " + sug);
    }

    public void run() {
        try {
            if ("".equals(fileName)) {
                br = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                br = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(fileName + ".out");
            }
            solve();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    BufferedReader br;
    StringTokenizer in;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (in == null || !in.hasMoreTokens()) {
            in = new StringTokenizer(br.readLine());
        }
        return in.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

}
