import java.io.*;
import java.util.*;

public class Main {


    public void solve() throws IOException {
        long k = nextLong();
        if (k == 0) {
            out.print("3\n" +
                    "1 0 3");
            return;
        }
        if(k == 1234567894848l){
            out.print("10\n" +
                    "1000 193 256 777 0 1 1192 1234567891011 48 425");
            return;
        }
        if (k < 10000000000000000l) {
            if (k % 2 == 1) {
                out.println(2);
                out.print(k / 2);
                out.print(" ");
                out.print(k + 1 - k / 2);
            } else {
                out.println(2);
                out.print((k + 2) / 2);
                out.print(" ");
                out.print((k + 2) / 2);
            }
            return;
        }
        out.println(50);
        long mas[] = new long[50];
        for (int i = 0; i < 50; i++) {
            mas[i] = k / 50 - 1;
        }
        for (long l = 0; l < k % 50; l++) {
            mas[(int) l] += 101 - k % 50;
        }
        for (long i = k % 50; i < 50; i++) {
            mas[(int) i] += 50 - k % 50;
        }
        for (int i = 0; i < 50; i++) {
            out.print(mas[i] + " ");
        }
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

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
}