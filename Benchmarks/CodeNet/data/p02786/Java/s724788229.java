import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        
        long ans = 0;
        long pow = 1;
        int i = 0;
        while (H > 0) {
            H /= 2;
            i++;

            ans += pow;

            pow *= 2;
        }

        System.out.println(ans);
    }
}
