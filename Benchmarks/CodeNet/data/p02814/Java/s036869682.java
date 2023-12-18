
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        long tgt = scan.nextInt();
        for(int i = 1; i < N; i++){
            int tmp = scan.nextInt();
            tgt = lcm(tmp, tgt);
        }

        int ans = 0;
        double seed = 0.5;
        while(tgt * seed <= M) {
            ans++;
            seed += 1;
        }

        os.println(ans);
    }

    static public long lcm(long a, long b) {
        if(a == b)
            return a;

        if(a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        long answer =  a*(b/(gcd(a, b)));
        return answer;
    }

    static public long gcd(long a, long b) {
        while(a > 0) {
            long tmpa = a;
            a = b % a;
            b = tmpa;
        }
        return b;
    }

}