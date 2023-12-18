
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X  =sc.nextInt();
        int Y  =sc.nextInt();
        int Z  =sc.nextInt();
        int K  =sc.nextInt();

        long[] x = new long[X];
        for (int i = 0; i <X ; i++) x[i]=sc.nextLong();
        long[] y = new long[Y];
        for (int i = 0; i <Y ; i++) y[i]=sc.nextLong();
        long[] z = new long[Z];
        for (int i = 0; i <Z ; i++) z[i]=sc.nextLong();

        long[] xy = new long[X*Y];
        int idx = 0;
        for (int i = 0; i < X ; i++) {
            for (int j = 0; j < Y ; j++) {
                xy[idx++] = x[i] + y[j];
            }
        }

        Arrays.sort(xy);
        int loop1 =Math.min(K,xy.length);
        long[] xyz = new long[loop1*Z];
        idx=0;
        for (int i = xy.length-1; i >= xy.length-loop1 ; i--) {
            for (int j = 0; j < Z ; j++) {
                xyz[idx++] = xy[i] + z[j];
            }
        }

        Arrays.sort(xyz);

        for (int i = 0; i < K; i++) {

            System.out.println(xyz[xyz.length-1-i]);

        }
    }

}
