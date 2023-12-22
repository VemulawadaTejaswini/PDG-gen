import java.util.Scanner;

public class Main {
    
    public static void main (String... args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[][] matrixA = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int[] matrixB = new int[m];
        for (int i = 0; i < m; i++) {
            matrixB[i] = Integer.parseInt(scanner.nextLine());
        }
        
        calcMatrix(matrixA, matrixB, n, m);
    }
    
    private static void calcMatrix(int[][] a, int[] b, int n, int m) {
        for (int i=0; i < n; i++) {
            int sum = 0;
            for (int j=0; j<m; j++) {
                sum += a[i][j] * b[j];
            }
            System.out.println(String.format("%d", sum));
        }
    }
}
