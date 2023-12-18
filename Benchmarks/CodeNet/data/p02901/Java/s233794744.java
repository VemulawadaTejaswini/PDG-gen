import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    static long gcd(long p, long q) { if(q == 0) return p; return gcd(q, p % q);}
    static Scanner sc = new Scanner(System.in);
    static int[] cost = new int[1001];
    static boolean[][] lock = new boolean[1001][13];
    static int N, M;
    static int ret = Integer.MAX_VALUE;
    static ArrayList<Integer> arr = new ArrayList<>();

    static boolean check() {
        boolean[] visited = new boolean[N];

        for(int a : arr) {
            for(int i = 0; i < N; i++) {
                visited[i] |= lock[a][i];
            }
        }

        for(int i = 0; i < N; i++)
            if(visited[i] == false)
                return false;
        return true;
    }

    static void dfs(int cur_idx, int cur_cost) {
        //if(cur_idx >= N) return;
        if(check()) {
            ret = Math.min(ret, cur_cost);
        }
        if(cur_idx + 1 >= N) return;

        dfs(cur_idx + 1, cur_cost); // not choose

        arr.add(cur_idx + 1);
        dfs(cur_idx + 1, cur_cost + cost[cur_idx+1]); // choose
        arr.remove(arr.size() - 1);

    }

    public static void main(String[] args) {

        N = sc.nextInt(); M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            cost[i] = a;
            for(int j = 0; j < b; j++) {
                lock[i][sc.nextInt() - 1] = true; // [1001][13]
            }
        }

        dfs(-1, 0);

        System.out.println(ret == Integer.MAX_VALUE ? -1 : ret);
    }
}
//[B@25618e91
//[B@326de728
//