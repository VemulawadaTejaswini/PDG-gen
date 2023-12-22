import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int l = Integer.parseInt(lines[2]);
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[m][l];
        int[][] matrix3 = new int[n][l];
        createMatrix(br, n, m, matrix1);
        createMatrix(br, m, l, matrix2);
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                for(int k=0;k<m;k++){
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                System.out.print(matrix3[i][j]);
                if(j<l-1)
                    System.out.print(" ");
            }
            
            System.out.println();
        }

    }

    private static void createMatrix(BufferedReader br, int n, int m, int[][] matrix1) throws IOException {
        String[] lines;
        for (int i = 0; i < n; i++) {
            lines = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = Integer.parseInt(lines[j]);
            }
        }
    }
}