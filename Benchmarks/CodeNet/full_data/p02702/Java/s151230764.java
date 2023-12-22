import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] mods = new int[2019];
        Arrays.fill(mods, 0);
        mods[0] = 1;
        BigInteger _2019 = new BigInteger("2019");
        for (int i = 0; i < S.length(); i ++) {
            String str = S.substring(i);
            int mod = new BigInteger(str).mod(_2019).intValue();
            mods[mod] = mods[mod] + 1;
        }

        int ans = 0;
        for (int i = 0; i < mods.length; i ++) {
            int count = mods[i];
            ans += (count - 1)*count / 2;
        }
        System.out.println(ans);
    }
}
