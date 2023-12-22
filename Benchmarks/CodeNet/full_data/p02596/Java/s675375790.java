import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long ans = -1l;
        if(k % 2 == 0) {
            System.out.println(-1);
            return;
        }
        BigInteger tmp2 = new BigInteger("7");
        while(true) {
            //tmp2 = tmp2.remainder(new BigInteger(Integer.toString(k)));
            if(tmp2.remainder(new BigInteger(Integer.toString(k))).equals(BigInteger.ZERO)) {
                String s = tmp2.toString();
                ans = s.length();
                break;
            }
            tmp2 = tmp2.multiply(new BigInteger("10"));
            tmp2 = tmp2.add(new BigInteger("7"));
        }
        System.out.println(ans);
    }
}