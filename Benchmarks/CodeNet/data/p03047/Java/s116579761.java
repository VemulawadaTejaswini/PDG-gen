import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int n;
    static int k;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){
        int ans;

        ans = n-k+1;

        System.out.println(ans);
    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
