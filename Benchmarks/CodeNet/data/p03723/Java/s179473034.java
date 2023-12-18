import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        long A = nextLong();
        long B = nextLong();
        long C = nextLong();

        if((A % 2 != 0) || (B % 2 != 0) || (C % 2 !=0)) {
            writer.println(0);
            return;
        }
        for(int steps = 1; steps <= 100_000_000; ++steps) {
            long halfA = A / 2;
            long halfB = B / 2;
            long halfC = C / 2;
            A = halfB + halfC;
            B = halfA + halfC;
            C = halfA + halfB;
            if((A % 2 != 0) || (B % 2 !=0) || (C % 2 !=0)) {
                writer.println(steps);
                return;
            }
        }
        writer.println(-1);
    }


    public static void main(String[] args) {
        new Main().run();
    }



    BufferedReader reader;
    //    BufferedReader reader2;
    StringTokenizer tokenizer;
    PrintWriter writer;
    //    BufferedWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//            reader = new BufferedReader(new FileReader("input.txt"));
            //            reader2 = new BufferedReader(new FileReader("1.in"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new     PrintWriter("output.txt");
//                                                    writer = new BufferedWriter(System.out);
            //                        writer = new BufferedWriter(new OutputStreamWriter(System.out));
            solve();
            reader.close();
            //            reader2.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }

    short nextShort() throws IOException {
        return Short.parseShort(nextToken());
    }

    String nextToken() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }

}