import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix1 = new int[n][m];
        int[] matrix2 = new int[m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < m; i++) {
            matrix2[i] = Integer.parseInt(br.readLine());
        }
        int[] sum = dot(matrix1, matrix2, n, m);
        for (int i = 0; i < n; i++) {
            System.out.println(sum[i]);
        }
    }

    static int[] dot(int[][] matrix1, int[] matrix2, int n, int m) {
        int[] sum = new int[n];
        Arrays.fill(sum, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i] += (matrix1[i][j] * matrix2[j]);
            }
        }
        return sum;
    }
}