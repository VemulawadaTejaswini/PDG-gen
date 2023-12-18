import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static long M = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int K = array[1];
            int[][] matrix = readIntMatrix(reader, N - 1);

            List<Integer>[] childrens = new List[N];
            for (int i = 0; i < N; i++) {
                childrens[i] = new ArrayList<>();
            }

            for (int i = 0; i < N - 1; i++) {
                int A = matrix[i][0] - 1;
                int B = matrix[i][1] - 1;
                childrens[A].add(B);
                childrens[B].add(A);
            }

            long ans = K * dfs(0, -1, childrens, K) % M;

            System.out.println(ans);
        }
    }

    public static long dfs(int vertex, int parent, List<Integer>[] childrens, int K) {
        long ans = 1;

        int c = (parent == -1) ? K - 1 : K - 2;
        for (int child : childrens[vertex]) {
            if (child == parent) {
                continue;
            }

            ans = ans * c % M;
            c--;
        }

        for (int child : childrens[vertex]) {
            if (child == parent) {
                continue;
            }

            ans = ans * dfs(child, vertex, childrens, K) % M;
        }

        return ans;
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

    public static int[][] readIntMatrix(BufferedReader reader, int N) throws Exception {
        int[][] matrix = new int[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readIntArray(reader);
        }
        return matrix;
    }

}
