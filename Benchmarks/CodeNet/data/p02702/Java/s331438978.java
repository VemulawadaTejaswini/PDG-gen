import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int len = S.length();

        BigInteger _2019 = new BigInteger("2019");
        BigInteger[] mods = new BigInteger[len + 1];
        mods[len] = BigInteger.ZERO;
        for (int i = 0; i < len; i ++) {
            String sub = S.substring(i);
            mods[i] = new BigInteger(sub).mod(_2019);
        }

        int ans = 0;
        for (int i = 0; i < mods.length; i ++) {
            for (int j = i + 1; j < mods.length; j ++) {
                if (mods[i].equals(mods[j])) {
                    ans ++;
                }
            }
        }

        System.out.println(ans);
    }
}