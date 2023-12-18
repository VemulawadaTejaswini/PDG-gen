import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        double[] p = new double[N + 1];
        double[][] f = new double[N + 1][N + 1];
        for(int i = 1; i <= N;  i++)p[i] = sc.nextDouble();

        // 投i次，向上次数为j;
//        f[0][0] = 1;
//        for(int i = 1; i <= N; i ++){
//            f[i][0] = f[i - 1][0] * (1 - p[i]);
//            for(int j = 1; j <= i; j ++){
//                f[i][j] = f[i - 1][j - 1] * p[i] + f[i - 1][j] * (1 - p[i]);
//            }
//        }
//        int cnt;
//        if((N&1) == 1) cnt = N + 1 >> 1;
//        else cnt = (N >> 1) + 1;
//        double res = 0.0;
//        for(int i = cnt; i <= N; i++)res += f[N][i];
//        System.out.println(res);
//         向上次数为i，投j次
        f[0][0] = 1;
        for(int j = 1; j <= N; j ++) {
            f[0][j] = f[0][j - 1] * (1 - p[j]);
        }
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j ++){
//                f[0][j] = f[0][j - 1] * (1 - p[j]);
                f[i][j] = f[i - 1][j - 1] * p[j] + f[i][j - 1] * (1 - p[j]);
            }
        }
        double res = 0.0;
        for(int i = 0; i <= N; i ++){
            if(i > (N - i))res += f[i][N];
        }
        System.out.println(res);
    }
}