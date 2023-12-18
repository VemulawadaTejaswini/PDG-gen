import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] teaValue = new long[4];
        for(int i = 0;i < 4;i++) teaValue[i] = sc.nextLong();
        long n = sc.nextLong();
        double[][] tmpValue = new double[4][];
        double l = 0.25;
        for(int i = 0;i < 4;i++) {
            double[] tmp = new double[3];
            tmp[0] = teaValue[i] / l;
            tmp[1] = i;
            tmp[2] = l;
            tmpValue[i] = tmp;
            l *= 2d;
        }
        
        // 1リットル当たりの値段でソート
        Arrays.sort(tmpValue, (a, b) -> Double.compare(a[0], b[0]));

        long sum = 0;
        for(int i = 0;i < 4;i++) {
            sum += (((long)Math.floor(n / tmpValue[i][2])) * teaValue[(int)tmpValue[i][1]]);
            n -= (long)(((long)Math.floor(n / tmpValue[i][2])) * tmpValue[i][2]);
        }

        System.out.println(sum);
    }

}
