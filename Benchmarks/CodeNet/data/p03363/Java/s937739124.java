import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static long A;
    static long B;
    static long C;
    static int[] map;
    static long[] cost;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        map = new int[N + 1];
        cost = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            map[i] = scanner.nextInt();
            cost[i] = cost[i - 1] + map[i];
        }


        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N + 1; j++) {
                if(cost[j] - cost[i] == 0){
                    ans++;
                }
            }
        }

        System.out.println(ans);







    }
}

