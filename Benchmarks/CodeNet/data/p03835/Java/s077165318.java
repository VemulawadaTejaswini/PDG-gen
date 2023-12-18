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
        int min = (s/ 3 + 1) - k - (s/ 3 + 1) ;
        min = Math.max(min, 0);
        for (int i = min; i <= k; i++) {
            for (int j = min; j <= k; j++) {
                for (int l = min; l <= k; l++) {
                    if(i + j + l == s)cnt++;
                }
            }
        }


        System.out.println(cnt);

    }





}


