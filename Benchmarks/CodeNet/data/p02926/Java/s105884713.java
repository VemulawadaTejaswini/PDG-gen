import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] a = new double[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextDouble();
            a[i][1] = sc.nextDouble();
        }
        int[][] dir = new int[][]{{1, 1}, {-1, 1}, {1, -1}, {-1, -1}};
        double ans = 0.0;
        for(int[] d : dir){
            double[] tmp = new double[2];
            for (int i = 0; i < n; i++) {
                double c = a[i][0] * d[0] + a[i][1] * d[1];
                if(0.0 < c){
                    tmp[0] += a[i][0];
                    tmp[1] += a[i][1];
                }
            }
            double tans = Math.sqrt(tmp[0] * tmp[0] + tmp[1] * tmp[1]);
            if(ans < tans) ans = tans;
        }
        System.out.println(ans);
        sc.close();

    }

}
