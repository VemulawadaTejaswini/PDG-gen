import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main implements Runnable{
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
    }

    public void run() {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long T[] = new long[N];

        for(int i = 0; i < N; i++) {
            T[i] = scan.nextLong();
        }

        scan.close();

        long lcm = 0;
        lcm = lcm(T[0], T[1]);
        for(int i = 2; i < N; i++) {
            lcm = lcm(lcm, T[i]);
        }

        os.println(lcm);
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