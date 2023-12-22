import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            if (n == 0 && s == 0) {
                break;
            }

            System.out.println(dfs(n, 0, s));
        }

        sc.close();
    }

    public static int dfs(int depth, int from, int sum) {
        if(depth == 0){
            if(sum == 0){
                return 1;
            }
            return 0;
        }

        int ans = 0;
        for(int v = from; v < 10;v++){
            ans += dfs(depth - 1, v + 1, sum - v);
        }
        return ans;
    }
}
