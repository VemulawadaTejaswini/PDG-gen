import java.math.BigInteger;
import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {
     static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s, k;
        k = scanner.nextInt();
        s = scanner.nextInt();

        int cnt = 0;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                for (int l = 0; l <= k; l++) {
                    if(i + j + l == s)cnt++;
                }
            }
        }


        System.out.println(cnt);

    }





}


