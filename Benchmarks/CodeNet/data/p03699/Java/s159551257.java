
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    static int[] map = new int[104];
    static int max = 0;
    static int N;

    static int[][] memo = new int[30000][104];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextInt();
        }


        dfs(0,0);

        System.out.println(max);


    } // mainMethod

    static void dfs(int to, int n){
        if(memo[to][n] != 0){
            return;
        }else{
            memo[to][n] = 1;
        }
        if(n == N){
            if(to % 10 == 0)return;
            max = Math.max(max, to);

            return;
        }

        dfs(to + map[n], n + 1);
        dfs(to, n + 1);


    }



} // MainClass
