import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] p = new double[n];

        for(int i = 0; i < n; i++){
            p[i] = sc.nextDouble();
        }

        int T = 0;
        int H = 1;
        double[][] a = new double[n][n+1];

        a[0][0] = 1 - p[0];
        a[0][1] = p[0];

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i+1; j++){
                if(j != 0)
                a[i][j] = p[i]*(a[i-1][j-1]);
                a[i][j] += (1-p[i])*(a[i-1][j]);
            }
        }

        double ans = 0;

        for(int i = (int) Math.ceil(n/2.0); i <= n; i++){
            ans += a[n-1][i];
        }

        System.out.println(ans);
    }
}
