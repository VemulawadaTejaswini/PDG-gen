import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        long x = s.length();
        String t = scan.next();
        long y = t.length();
        long lcm = x * y / gcd(x, y);
        String a = s;
        while(a.length() != lcm) {
            a += s;
        }
        String b = t;
        while(b.length() != lcm) {
            b += t;
        }
        if (a.equals(b)) {
            System.out.println(-1);
            return;
        }
        long answer = 0;
        int i = 1;
        String c = t;
        while (c.length() < lcm) {
            if (0 <= a.indexOf(c)) {
                answer = i;
            }
            c += t;
            i += 1;
        }
        System.out.println(answer);
    }
    private long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
