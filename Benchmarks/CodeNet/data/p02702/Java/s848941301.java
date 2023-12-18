import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        BigDecimal _2019 = BigDecimal.valueOf(2019);

        int[] rem = new int[2019];
        rem[0] = 1;
        int ans = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            BigDecimal n = new BigDecimal(S.substring(i));
            int r = n.remainder(_2019).intValue();
            if (rem[r] != 0) {
                //                System.out.println("i = " + i);
                //                System.out.println("rem[r] = " + r);
            }
            ans += rem[r];
            rem[r]++;
        }

        System.out.println(ans);
        //        System.out.println(Arrays.toString(rem));
    }

}
