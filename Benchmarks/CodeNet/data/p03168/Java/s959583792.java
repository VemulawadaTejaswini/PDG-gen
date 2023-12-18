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
        double[][][] a = new double[n][n+1][2];

        a[0][0][T] = 1 - p[0];
        a[0][1][H] = p[0];

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i+1; j++){
                if(j != 0)
                a[i][j][H] = p[i]*(a[i-1][j-1][H]+a[i-1][j-1][T]);
                a[i][j][T] = (1-p[i])*(a[i-1][j][H]+a[i-1][j][T]);
            }
        }

        double ans = 0;

        for(int i = (int) Math.ceil(n/2.0); i <= n; i++){
            ans += a[n-1][i][H]+a[n-1][i][T];
        }

        System.out.println(ans);
    }
}
