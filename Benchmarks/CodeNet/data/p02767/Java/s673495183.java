import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.CookieHandler;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException {
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++) x[i] = sc.nextInt();
        long mini = Long.MAX_VALUE/2;
        for(int i=0;i<=100;i++){
            long cur = helper(x,i);
            mini = Math.min(mini,cur);
        }
        System.out.println(mini);
    }
    long helper(int[] x, int guess){
        long ans = 0;
        for(int s:x){
            long diff = s-guess;
            ans += diff*diff;
        }
        return ans;
    }
}

