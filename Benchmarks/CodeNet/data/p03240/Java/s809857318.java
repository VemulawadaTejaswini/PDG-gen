import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int K;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;
    static long ans = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        long[] h = new long[N];

        long high = -1;

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            h[i] = scanner.nextLong();

            high = Math.max(high, h[i]);
        }

        for (int i = 0; i <= 100; i++) {

            for (int j = 0; j <= 100; j++) {
                for (long k = high; k < high + 101; k++) {
                    boolean ok = true;
                    for (int l = 0; l < N; l++) {
//                        System.out.println(i + " " + j + " " + k);
//                        System.out.println(k - Math.abs(x[l] - i) - Math.abs(y[l] - j));
                        if(k - Math.abs(x[l] - i) - Math.abs(y[l] - j) != h[l]){
                            ok = false;
                            break;
                        }
                    }
                    if(ok){
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }


    }
}

