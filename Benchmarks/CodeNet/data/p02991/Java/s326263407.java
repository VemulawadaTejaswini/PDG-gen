import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int M = array[1];
            Set<Integer>[] dests = new Set[N];
            for (int i = 0; i < N; i++) {
                dests[i] = new HashSet<>();
            }
            for (int i = 0; i < M; i++) {
                array = readIntArray(reader);
                int u = array[0] - 1;
                int v = array[1] - 1;
                dests[u].add(v);
            }
            array = readIntArray(reader);
            int S = array[0] - 1;
            int T = array[1] - 1;

            Set<Integer>[] dests2 = new Set[N];
            for (int i = 0; i < N; i++) {
                dests2[i] = new HashSet<>();
            }

            for (int i = 0; i < N; i++) {
                for (int d1 : dests[i]) {
                    for (int d2 : dests[d1]) {
                        for (int d3 : dests[d2]) {
                            if (i != d3) {
                                dests2[i].add(d3);
                            }
                        }
                    }
                }
            }

            PriorityQueue<Vertex> queue = new PriorityQueue<>(new Comparator<Vertex>() {
                @Override
                public int compare(Vertex o1, Vertex o2) {
                    return o1.cost - o2.cost;
                }
            });
            queue.add(new Vertex(S, 0));

            boolean[] used = new boolean[N];
            while (queue.size() > 0) {
                Vertex vertex = queue.poll();

                if (used[vertex.n]) {
                    continue;
                }

                if (vertex.n == T) {
                    System.out.println(vertex.cost);
                    return;
                }

                used[vertex.n] = true;

                for (int d : dests2[vertex.n]) {
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
