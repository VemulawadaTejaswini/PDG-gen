import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt(), m = in.nextInt();
        if (Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }
        BigInteger ans = new BigInteger("1");
        for (int i = Math.min(n, m); i > 0; i--) {
            ans = ans.multiply(new BigInteger(String.valueOf(i)));
        }
        ans = ans.multiply(ans);
        
        
        if(n == m){
            ans = ans.multiply(new BigInteger(String.valueOf(2)));
        }else{
            ans = ans.multiply(new BigInteger(String.valueOf(Math.max(n, m))));
        }
        ans = ans.remainder(new BigInteger(String.valueOf("1000000007")));
        System.out.println(ans.toString());

    }
}
