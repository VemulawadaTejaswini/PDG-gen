import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static long[] map;
    static long[] cost;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        if(N > 101)return;

        C = scanner.nextLong();

        map = new long[N];
        cost = new long[N];

        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextLong();
            cost[i] = scanner.nextLong();
        }

        long nokori = 0;
        long ans = 0;

        for (int i = 0; i <= N; i++) {
            nokori = 0;

            if(i > 0) {
                for (int j = 1; j <= i; j++) {
                    long add = 0;
                    if(j > 1)add = C - map[N - j + 1];
                    nokori -= C - map[N - j];
                    nokori += add;
                    nokori += cost[N - j];
                    ans = Math.max(ans, nokori);
                }

                nokori -= C - map[N - i];
            }
            for (int j = 0; j < N - i; j++) {
                long add = 0;
                if(j >= 1)add =  map[j - 1];
                nokori -= map[j];
                nokori += add;
                nokori += cost[j];
                ans = Math.max(ans, nokori);
            }
        }

        for (int i = 0; i < N; i++) {
            nokori = 0;


                for (int j = 0; j <= i; j++) {
                    long add = 0;
                    if (j >= 1) add = map[j - 1];
                    nokori -= map[j];
                    nokori += add;
                    nokori += cost[j];
                    ans = Math.max(ans, nokori);
                }
                nokori -= map[i];


            for (int j = N - 1; j > i; j--) {
                long add = 0;
                if(j < N - 1)add = C - map[j + 1];
                nokori -= C - map[j];
                nokori += add;
                nokori += cost[j];
                ans = Math.max(ans, nokori);
            }

        }

        System.out.println(ans);



    }
}

