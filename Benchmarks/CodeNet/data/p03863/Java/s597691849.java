import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main implements Runnable {

    private void solve() throws IOException {

        String s = reader.readLine();
        int c = 0;
        for(int i = 1; i < s.length() - 1; ++i) {
            if(s.charAt(i-1) != s.charAt(i+1)) ++c;
        }
        if(c % 2 != 0) writer.println("First");
        else writer.println("Second");
    }


    public static void main(String[] args) {

        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer;

    public void run() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
//             reader = new BufferedReader(new FileReader("input.txt"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
            solve();
            reader.close();
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

    String nextToken() throws IOException {
        while(tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }

        return tokenizer.nextToken();
    }
}
