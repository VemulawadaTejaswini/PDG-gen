import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BigInteger MOD = new BigInteger("1000000007");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        BigInteger ans = new BigInteger(String.valueOf(n - k + 1));
        System.out.println(ans.toString(10));
        for(int i = 1; i < k; i++) {
            // ans = ans * (n - k - i + 1) * (k - i) / (i + 1) / i;
            ans = ans.multiply(new BigInteger(String.valueOf(n - k - i + 1)))
                    .multiply(new BigInteger(String.valueOf(k - i)))
                    .divide(new BigInteger(String.valueOf(i + 1)))
                    .divide(new BigInteger(String.valueOf(i)));
            System.out.println(ans.remainder(MOD).toString(10));
        }
    }
}