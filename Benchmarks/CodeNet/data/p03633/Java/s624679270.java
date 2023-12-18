import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
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

        long lcm = 0;
        lcm = lcm(T[0], T[1]);
        for(int i = 2; i < N; i++) {
            lcm = lcm(lcm, T[i]);
        }

        os.println(lcm);
    }

    static public long lcm(long a, long b) {
        if(a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        if(a > b) {
            return b*(a/(gcd(a, b)));
        } else {
            return a*(b/(gcd(a, b)));
        }
    }

    static public long gcd(long a, long b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}