import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        double[][] c = new double[n][d];
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                c[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = 0;
                for (int k = 0; k < d; k++) {
                    dist += Math.pow(c[i][k] - c[j][k], 2);
                }
                double dist_ = Math.sqrt(dist);
                for (int l = 0; l < dist; l++) {
                    if (l * l == dist) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}