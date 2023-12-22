import java.io.PrintWriter;
import java.util.*;

public class Main {

    private static long gcd(long a, long b) {
        if ( a== 0)return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        //String s = in.next();


        int n = in.nextInt(), k = in.nextInt();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans += ans / (k - 1);
            ans++;
        }
        out.println(ans);

        out.flush();
    }

}

