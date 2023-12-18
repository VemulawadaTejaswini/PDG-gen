import java.time.Year;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int s;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        sc.close();
    }
 

    static int f(int n) {
        if (n%2==0) {
            return n/2;
        } else {
            return 3*n+1;
        }
    }

    static boolean[] memo;

    /**
     * solver
     */
    static void solve(){
        memo = new boolean[1000000];

        int ans = 1;
        int x = s;
        memo[x] = true;

        int y;

        while(true) {
            y = f(x);
            ans ++;

            if (memo[y]) {
                break;
            } else {
                memo[y] = true;
                x = y;
            }
        }

        System.out.println(ans);
    }


    public static void main(String args[]) {

        input();

        solve();
    }
}
