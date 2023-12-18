import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static int A;
    static long B;
    static long C;
    static long[] x = new long[1000];
    static long[] y = new long[1000];
    static long[] z = new long[1000];





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextLong();
            y[i] = scanner.nextLong();
            z[i] = scanner.nextLong();
        }


        int[][] tukau = {{1,1,1}, {1,1,-1}, {1,-1,1}, {1,-1,-1}, {-1,1,1}
                , {-1,1,-1}, {-1,-1,1}, {-1,-1,-1}};

        long ret = 0;
        long[] use = new long[N];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < N; j++) {
                use[j] = x[j] * tukau[i][0] + y[j] * tukau[i][1] + z[j] * tukau[i][2];
            }
            Arrays.sort(use);

            long ans = 0;
            for (int j = 0; j < M; j++) {
                ans += use[N - j - 1];
            }
//            System.out.println(ans);
            ret = Math.max(ans, ret);
        }

        System.out.println(ret);




    }

//    public static void itter()

}

