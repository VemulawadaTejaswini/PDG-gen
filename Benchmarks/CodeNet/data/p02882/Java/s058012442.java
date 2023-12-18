import java.util.*;

public class Main {
    final static int MOD = 1000000007;
    
    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = in.nextDouble();
        double ans = 0;
        
        if (x <= b * a * a / 2) {
            double c = x / (b * a) * 2;
            //double d = Math.sqrt(Math.pow(b,2) + Math.pow(c,2));
            double radian = Math.atan2(c, b);
            ans = 90 - radian * 180 / Math.PI;
        
        } else {
            double e = ((2 * x) / Math.pow(a,2)) - b;
            double f = b - e;
            double radian = Math.atan2(a, f);
            ans = 90 - radian * 180 / Math.PI;
        }
        
        System.out.println(ans);
        
        
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