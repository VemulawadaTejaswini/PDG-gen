import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        int N = nextInt();
        int[] degree = new int[N+1];
        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for(int i = 0; i <= N; ++i) adj[i] = new ArrayList<>();

        for(int m = 0; m < N - 1; ++m) {
            int a = nextInt();
            int b = nextInt();
            adj[a].add(b);
            adj[b].add(a);
            degree[a]++;
            degree[b]++;
        }
        for(int i = 1; i <= N; ++i) {
            int count = 0;
            for(int to : adj[i]) {
                if(degree[to] == 1) ++count;
            }
            if(count > 1) {
                writer.println("First");
                return;
            }
        }
        int count = 0;
        for(int i = 1; i <= N; ++i) {
            if(adj[i].size() == 1) ++count;
        }
        if(count % 2 == 0) {
            writer.println("First");
            return;
        }
        writer.println("Second");

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