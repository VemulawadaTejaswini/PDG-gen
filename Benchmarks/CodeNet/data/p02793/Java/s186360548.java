import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = Integer.parseInt(str);
        str = input.nextLine();
        String[] substr = str.split(" ", 0);
        BigInteger[] arr = new BigInteger[10000];
        BigInteger LCM = BigInteger.ZERO, ans = BigInteger.ZERO, MOD = BigInteger.valueOf(1000000007);
        for (int i = 0; i < n; i++) {
            arr[i] = BigInteger.valueOf(Integer.parseInt(substr[i]));
            if (i == 0) {
                LCM = arr[i];
            } else {
                LCM = lcm(LCM, arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            //System.out.println("sum is : "+ans);
            ans = ans.add(LCM.divide(arr[i]));
            ans = ans.mod(MOD);
        }

        System.out.print(ans);
    }

    static BigInteger gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a, b));
    }

}
