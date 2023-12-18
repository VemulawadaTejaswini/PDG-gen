import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        int n = in.nextInt();
        int[] a = new int[n];

        Map<Integer, Integer> frequencies = new HashMap<>();
        Map<Integer, Long> combinations = new HashMap<>();

        String[] tokens = in.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
            frequencies.merge(a[i], 1, Integer::sum);
        }

        long totalCombinations = 0;
        for (Map.Entry<Integer, Integer> frequency : frequencies.entrySet()) {
            long combination = (frequency.getValue() * (frequency.getValue() - 1)) / 2;
            combinations.put(frequency.getKey(), combination);
            totalCombinations += combination;
        }

        for (int i = 0; i < n; i++) {
            long frequency = frequencies.get(a[i]);
            long combinationWithoutK = ((frequency - 1) * (frequency - 2)) / 2;
            long delta = combinations.get(a[i]) - combinationWithoutK;
            out.println(totalCombinations - delta);
        }
    }
}
