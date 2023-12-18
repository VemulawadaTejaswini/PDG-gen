
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    void solve() {
        String input = in.nextToken();
        StringBuilder sb = new StringBuilder();
        int[] index = new int[input.length()];
        for(int i = 0; i < index.length ; i++) {
            index[i] = i;
        }
        HashSet<String> result = new HashSet<>();
        result.add(input);
        for(int i = 0 ; i < index.length-1 ; i++) {
            for(int j = i+1 ; j < index.length ; j++) {
                int[] index_changed = reverse(index, i, j);
                Arrays.stream(index_changed).forEach(value ->
                        sb.append(input.charAt(value)));
                result.add(sb.toString());
                sb.delete(0, sb.length());

            }
        }
        out.println(result.size());

    }
    private int[] reverse(int[] index, int start, int end) {
        int[] changed = index.clone();
        for(int i = 0 ; i <= (end - start)/2 ; i++) {
            int temp = changed[start + i];
            changed[start + i] = changed[end - i];
            changed[end - i] = temp;
        }
        return changed;
    }



    FastScanner in;
    PrintWriter out;

    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}