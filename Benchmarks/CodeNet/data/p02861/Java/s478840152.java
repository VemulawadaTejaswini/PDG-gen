import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        double[][] distances = new double[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == j) continue;

                if (distances[i][j] == 0 && distances[j][i] != 0) {
                    distances[i][j] = distances[j][i];
                    continue;
                }
                if (distances[i][j] != 0 && distances[j][i] == 0) {
                    distances[j][i] = distances[i][j];
                    continue;
                }

                distances[i][j] = Math.sqrt(Math.pow(x[i]-x[j], 2) + Math.pow(y[i]-y[j], 2));
            }
        }

        double total = 0;
        for (double[] d1: distances) {
            for (double d2: d1) {
                total += d2;
                System.out.print(String.valueOf(d2) + " ");
            }
            System.out.println("");
        }

        int a = 1;
        for (int i=n; i>1; i--) {
            a *= i;
        }
        System.out.println(total*(n-1)/a);
    }
}