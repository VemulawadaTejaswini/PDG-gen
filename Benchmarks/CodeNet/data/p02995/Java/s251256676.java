import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    private static long gcd(long x, long y) {
        if(x > y) {
            long tmp = x;
            x = y;
            y = tmp;
        }

        if(y % x == 0) return x;
        return gcd(x, y % x);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long a = Long.parseLong(in[0]);
        long b = Long.parseLong(in[1]);
        long c = Long.parseLong(in[2]);
        long d = Long.parseLong(in[3]);

        long p = b - (a - 1);
        long q = b / c - (a - 1) / c;
        long r = b / d - (a - 1) / d;
        long lcm = c / gcd(c, d) * d;
        long s = b / lcm - (a - 1) / lcm;

        System.out.println(p - q - r + s);
    }
}