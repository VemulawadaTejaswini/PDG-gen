import java.io.*;
import java.util.*;

public class Main implements Runnable {

    private void solve() throws IOException {

        int N = nextInt();
        long[] arr = new long[N];
        for(int i = 0; i < N; ++i) {
            arr[i] = nextLong();
        }

        Arrays.sort(arr);

        long[] pref = new long[N + 1];
        for(int i = 1; i <= N; ++i) {
            pref[i] = arr[i-1];
            pref[i] += pref[i-1];
        }

        int res = 0;
        for(int i = 0; i < N; ++i) {
            long candidate = arr[i]; // alive
            int low = 0;
            int high = i - 1;
            int max = -1;
            while(low <= high) {
                int mid = low + ( high - low ) / 2;
                long target = arr[mid];
                if(target  <= candidate * 2) {
                    max = Math.max(max, mid);
                    low = mid + 1;
                } else high = mid - 1;
            }
            long power = candidate;
            if(max != -1) {
                power += pref[max + 1];
            }
            int next = i + 1;
            while(next < N && ((power * 2L >= arr[next]))) power += arr[next++];
            if(i + 1== N || ((power * 2 >= arr[N-1]))) {
                ++res;
            }


        }
        writer.println(res);



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
//            reader = new BufferedReader(new FileReader("highcard.in"));
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