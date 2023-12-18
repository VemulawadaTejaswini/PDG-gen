import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        int N = nextInt();
        ArrayList<Double> ar = new ArrayList<>();
        for(int i = 0; i < N; ++i) {
            ar.add(nextDouble());
        }
        Collections.sort(ar);

        while(ar.size() > 1) {
            double first = ar.get(0);
            double second = ar.get(1);
            ar.remove(0);
            ar.remove(0);
            ar.add((first+second)/2.0);
            Collections.sort(ar);
        }
        writer.println(ar.get(0));
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
//            reader = new BufferedReader(new FileReader("a_1.txt"));
            tokenizer = null;
            writer = new PrintWriter(System.out);
//            writer = new PrintWriter("aa_1.txt");
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
