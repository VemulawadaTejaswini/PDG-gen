
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int T = sc.nextInt();

    public static void main(String[] args) {
        for (int i = 0; i < T; i++){
//            long dp[] = new long[];
            //二つ目の要素持たせてそこでlongでや
            Map<Long, Long> dpl = new HashMap<Long, Long>();
            for (long k = 0; k < Long.MAX_VALUE; k++){
                //dp[k] = Long.MAX_VALUE;
                dpl.put(k ,Long.MAX_VALUE);
            }
            long N = sc.nextLong();
            long al[] = new long[5];
            for (int j = 0; j < 4; j++){
                al[j] = sc.nextLong();
            }
            al[4] = al[3];
            //初期化
            dpl.put((long) 1, al[3]);
            //dp[1] = al[3];
            for (long l = 1; l < N * 2; l++){
                for (int m = 0; m < 5; m++) {
                    long tmp = 0;
                    if (m == 0)
                        tmp = l * 2;
                    else if (m == 1)
                        tmp = l * 3;
                    else if (m == 2)
                        tmp = l * 5;
                    else if (m == 3) {
                        if (l > 0) {
                            tmp = l - 1;
                        }
                    } else if (m == 4)
                        tmp = l + 1;

                    dpl.put(tmp, chmin(dpl.get(l) + al[m], dpl.get(tmp)));
                    //dp[tmp] = chmin(dp[l] + al[m], dp[tmp]);
                }
            }
            System.out.println(dpl.get(N));

        }
    }
    static long chmin(long a, long b){
        if (a > b)
            return b;
        else
            return a;
    }

}
