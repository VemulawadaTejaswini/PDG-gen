import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a = new double[4][3];
        a[0][0] = 0.25;
        a[1][0] = 0.5;
        a[2][0] = 1.0;
        a[3][0] = 2.0;
        a[0][1] = sc.nextDouble();
        a[1][1] = sc.nextDouble();
        a[2][1] = sc.nextDouble();
        a[3][1] = sc.nextDouble();
        a[0][2] = a[0][1] / a[0][0];
        a[1][2] = a[1][1] / a[1][0];
        a[2][2] = a[2][1] / a[2][0];
        a[3][2] = a[3][1] / a[3][0];
        Arrays.sort(a, (x, y) -> Double.compare(x[2], y[2]));
        long n = sc.nextLong();
        long ans = 0;
        for (int i = 0; i < 4; i++) {
            ans += (long)a[i][1] * Math.floor(n/ a[i][0]);
            n %= a[i][0];
        }
        System.out.println(ans);
        sc.close();
    }

}
