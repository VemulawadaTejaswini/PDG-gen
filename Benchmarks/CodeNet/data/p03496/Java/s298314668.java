import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jasper van Merle
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }

            int total = 0;
            List<String> operations = new ArrayList<>();

            while (true) {
                int x = findNextToIncrease(nums);

                if (x == -1) break;

                int maxIndex = x;
                int maxValue = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                    int t = nums[i] + nums[x];

                    if (t > maxValue) {
                        maxIndex = i;
                        maxValue = t;
                    }
                }

                operations.add((maxIndex + 1) + " " + (x + 1));
                total++;

                nums[x] = maxValue;
            }

            out.println(total);

            for (String operation : operations) {
                out.println(operation);
            }
        }

        private int findNextToIncrease(int[] arr) {
            int maxIndex = -1;
            int maxValue = Integer.MIN_VALUE;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    if (arr[i] > maxValue) {
                        maxIndex = i;
                        maxValue = arr[i];
                    }

                    if (i == 1 && arr[i - 1] > maxValue) {
                        maxIndex = i - 1;
                        maxValue = arr[i - 1];
                    }
                }
            }

            return maxIndex;
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

