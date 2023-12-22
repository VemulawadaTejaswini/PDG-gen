import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            long[] A = new long[n + 1];

            String[] line = in.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                A[i + 1] = Long.parseLong(line[i]);
            }

            StringBuilder out = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int node = i + 1;
                int pkey = node / 2;
                int left = 2 * node;
                int right = 2 * node + 1;

                long key = A[node];
                out.append("node ").append(node).append(": key = ").append(key).append(", ");
                if (0 < pkey && pkey < n + 1) {
                    out.append("parent key = ").append(A[pkey]).append(", ");
                }
                if (0 < left && left < n + 1) {
                    out.append("left key = ").append(A[left]).append(", ");
                }
                if (0 < right && right < n + 1) {
                    out.append("right key = ").append(A[right]).append(", ");
                }
                out.append("\n");
            }
            System.out.print(out.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

