import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    // input
    static int R;
    static int G;
    static int B;
    static int N;

    /**
     * input
     */
    static void input(){
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        G = sc.nextInt();
        B = sc.nextInt();
        N = sc.nextInt();
        sc.close();
    }
 
    /**
     * solver
     */
    static void solve(){
        int ans = 0;

        int r = 0;
        int g = 0;
        int b = 0;

        while (r * R <= N) {
            int k = N - r * R;
            g=0;
            while (g * G <= k) {
                int l = k - g * G;
                if (l % B == 0) {
                    ans ++;
                }
                g++;
            }
            r++;
        }

        System.out.println(ans);
    }

    public static void main(String args[]) {

        input();

        solve();
    }
}
