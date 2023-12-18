import java.util.*;

public class Main {
    final static int MOD = 1000000007;
    
    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        int[][] a = in.nextIntMatrix(3,3);
        int n = in.nextInt();
        int[] b = in.nextIntArray(n);
    
        for (int i = 0; i < n; i++) {
            int find = b[i];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (find == a[j][k]) {
                        a[j][k] = 0;
                    }
                }
            }
        }
    
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 1) {
                flag = true;
            }
            if (a[0][i] == 0 && a[1][i] == 0 && a[2][i] == 1) {
                flag = true;
            }
        }
        if ((a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) || (a[2][0] == 0 && a[1][1] == 0 && a[2][0] == 0)) {
            flag = true;
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    static class MyScanner {
        static Scanner sc = new Scanner(System.in);
        
        String next() {
            return sc.next();
        }
        
        String nextLine() {
            return sc.nextLine();
        }
        
        int nextInt() {
            return Integer.parseInt(sc.next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }
        
        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextDouble();
            }
            return array;
        }
        
        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLong();
            }
            return array;
        }
        
        String[] nextLineArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLine();
            }
            return array;
        }
        
        int[][] nextIntMatrix(int n, int m) {
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = nextInt();
                }
            }
            return matrix;
        }
        
        double[][] nextDoubleMatrix(int n, int m) {
            double[][] matrix = new double[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = nextDouble();
                }
            }
            return matrix;
        }
        
        long[][] nextLongMatrix(int n, int m) {
            long[][] matrix = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = nextLong();
                }
            }
            return matrix;
        }
    }
}