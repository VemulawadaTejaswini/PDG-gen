import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer str = new StringBuffer(s);
        String r = str.reverse().toString();
        int size = r.length();
        int ans = 0;
        int[] count = new int[2019];
        BigInteger total = BigInteger.ZERO;
        BigInteger mod = new BigInteger("2019");
        BigInteger exp = BigInteger.ONE;
        int index = 0;
        for (int i = 0; i < size; i++) {
            count[index]++;
            total = total.add(new BigInteger(r.substring(i, i + 1)).multiply(exp));
            index = total.remainder(mod).intValue();
            ans += count[index];
            exp = exp.multiply(BigInteger.TEN).remainder(mod);
        }
        System.out.println(ans);
    }
}
