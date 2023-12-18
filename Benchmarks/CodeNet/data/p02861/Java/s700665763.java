import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        x = new double[n];
        y = new double[n];
        int[] permutation = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = in.nextDouble();
            y[i] = in.nextDouble();
            permutation[i] = i;
        }
        calc(permutation, n);
//        System.out.println(sum);
//        System.out.println(c);
        System.out.println(sum / c);
    }
    private static double[] x = null;
    private static double[] y = null;
    private static double sum = 0.0d;
    private static int c = 0;
    private static void calc(int[] permutation, int m) {
        if(m == 1) {
            for(int i=1; i<permutation.length; i++) {
                double x2 = Math.pow(x[permutation[i-1]] - x[permutation[i]], 2);
                double y2 = Math.pow(y[permutation[i-1]] - y[permutation[i]], 2);
                sum += Math.sqrt(x2 + y2);
            }
            c++;
        }
        else {
            for(int i=0; i<m-1; i++) {
                calc(permutation, m-1);
                if(m%2 == 0) {
                    swap(permutation, i, m-1);
                }
                else {
                    swap(permutation, 0, m-1);
                }
            }
            calc(permutation, m-1);
        }
    }
    private static void swap(int[] permutation, int i, int j) {
        int t = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = t;
    }
}
