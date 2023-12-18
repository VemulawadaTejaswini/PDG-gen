import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static private HashMap<LcmPair, Long> lcmMap = new HashMap<>();

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
        if(a == b)
            return a;

        if(a > b) {
            long tmp = a;
            a = b;
            b = tmp;
        }

        for (Map.Entry<LcmPair, Long> lcmEntry : lcmMap.entrySet()) {
            if(lcmEntry.getKey().equals(a, b))
                return lcmEntry.getValue();
        }

        LcmPair lcmPair = new LcmPair(a, b);
        long answer =  a*(b/(gcd(a, b)));
        lcmMap.put(lcmPair, answer);
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

    public static class LcmPair{
        long a, b;
        public LcmPair(long a, long b) {
            this.a = a;
            this.b = b;
        }

        public boolean equals(long c, long d) {
            return a == c && b == d;
        }
    }
}