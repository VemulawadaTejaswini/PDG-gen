import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final long MOD = 1000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();

        long ans = 0;
        ans += (x / 11) * 2;
        x = x % 11;
        
        if (x == 0) {
            System.out.println(ans);
        } else if (x <= 5) {
            System.out.println(ans + 1);
        } else {
            System.out.println(ans + 2);
        }
    }
}