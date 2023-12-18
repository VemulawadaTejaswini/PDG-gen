import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        long X = nextLong();
        long Y = nextLong();

        if(X == 0 && Y == 0) {
            writer.println("Brown");
        } else if(X == 0 || Y == 0) {

            long max = Math.max(X,Y);
            if(max == 1) {
                writer.println("Brown");
            } else {
                writer.println("Alice");
            }
        } else {

            if(X == 1 && Y == 1) {
                writer.println("Brown");
            } else if(X == 1 || Y == 1) {
                writer.println("Alice");
            } else {

                long min = Math.min(X,Y);
                if(min % 2 != 0) {
                    writer.println("Alice");
                } else if(X % 2 == 0 && (Y % 2 == 0)) {
                    writer.println("Alice");
                } else writer.println("Brown");
            }
        }
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