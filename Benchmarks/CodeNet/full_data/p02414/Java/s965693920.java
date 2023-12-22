import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String line = br.readLine();
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            long[][] matrixA = new long[n][m];
            long[][] matrixB = new long[m][l];
            long[][] matrixC = new long[n][l];
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                for (int j = 0; j < m; j++) {
                    matrixA[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < m; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                for (int j = 0; j < l; j++) {
                    matrixB[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < l; j++) {
                    for (int k = 0; k < m; k++) {
                        matrixC[i][j] += matrixA[i][k]*matrixB[k][j];
                    }
                }
            }
            printMatrix(matrixC);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void printMatrix(long[][] matrix){
        for (long[] longs : matrix) {
            StringBuilder sb = new StringBuilder();
            for (long anLong : longs) {
                sb.append(anLong).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}