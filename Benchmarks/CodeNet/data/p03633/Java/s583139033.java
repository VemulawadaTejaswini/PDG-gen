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


        long result = T[0];

        for (int i = 1; i < N; i++) {
            result = lcm(result, T[i]);
        }


        os.println(result);
    }

    public static long gcd(long x, long y){

        if (x < y) {
            long t = x;
            x = y;
            y = t;
        }

        while (y > 0) {
            long r = x % y;
            x = y;
            y = r;
        }

        return x;

    }

    public static long lcm(long x, long y) {

        return x / gcd(x, y) * y;

    }
}