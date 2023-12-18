import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int M = array[1];

            List<Integer>[] dests = new List[N * 3];
            for (int i = 0; i < N * 3; i++) {
                dests[i] = new ArrayList<>();
            }
            for (int i = 0; i < M; i++) {
                array = readIntArray(reader);
                int u = array[0] - 1;
                int v = array[1] - 1;

                dests[u * 3].add(v * 3 + 1);
                dests[u * 3 + 1].add(v * 3 + 2);
                dests[u * 3 + 2].add(v * 3);
            }

            array = readIntArray(reader);
            int S = array[0] - 1;
            int T = array[1] - 1;

            PriorityQueue<Vertex> queue = new PriorityQueue<>(new Comparator<Vertex>() {
                @Override
                public int compare(Vertex o1, Vertex o2) {
                    return o1.cost - o2.cost;
                }
            });
            queue.add(new Vertex(S * 3, 0));

            boolean[] used = new boolean[N * 3];
            while (queue.size() > 0) {
                Vertex vertex = queue.poll();

                if (used[vertex.n]) {
                    continue;
                }

                if (vertex.n == T * 3) {
                    System.out.println(vertex.cost / 3);
                    return;
                }

                used[vertex.n] = true;

                for (int d : dests[vertex.n]) {
                    if (!used[d]) {
                        queue.add(new Vertex(d, vertex.cost + 1));
                    }
                }
            }

            System.out.println(-1);
        }
    }

    public static class Vertex {

        public int n;

        public int cost;

        public Vertex(int n, int cost) {
            this.n = n;
            this.cost = cost;
        }

    }

    public static String readString(BufferedReader reader) throws Exception {
        return reader.readLine();
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
    }

    public static long readLong(BufferedReader reader) throws Exception {
        return Long.parseLong(reader.readLine());
    }

    public static double readDouble(BufferedReader reader) throws Exception {
        return Double.parseDouble(reader.readLine());
    }

    public static String[] readStringArray(BufferedReader reader) throws Exception {
        return reader.readLine().split(" ");
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

    public static long[] readLongArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        long[] array = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Long.parseLong(str[i]);
        }
        return array;
    }

    public static double[] readDoubleArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        double[] array = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Double.parseDouble(str[i]);
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

    public static long[][] readLongMatrix(BufferedReader reader, int N) throws Exception {
        long[][] matrix = new long[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readLongArray(reader);
        }
        return matrix;
    }

    public static double[][] readDoubleMatrix(BufferedReader reader, int N) throws Exception {
        double[][] matrix = new double[N][];
        for (int i = 0; i < N; i++) {
            matrix[i] = readDoubleArray(reader);
        }
        return matrix;
    }

    public static int[] extractArray(int[][] matrix, int index) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static long[] extractArray(long[][] matrix, int index) {
        long[] array = new long[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

    public static double[] extractArray(double[][] matrix, int index) {
        double[] array = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][index];
        }
        return array;
    }

}
