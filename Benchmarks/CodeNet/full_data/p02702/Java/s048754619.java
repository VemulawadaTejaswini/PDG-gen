import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        BigDecimal _673 = BigDecimal.valueOf(673);
        char[] c = S.toCharArray();

        int ans = 0;

        int[] ruiseki = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            ruiseki[i] += (c[i] - '0') + (i == 0 ? 0 : ruiseki[i - 1]);
        }

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 3; j < S.length(); j++) {
                if ((ruiseki[j] - (i == 0 ? 0 : ruiseki[i-1])) % 3 != 0) {
                    continue;
                }
                BigDecimal n = new BigDecimal(S.substring(i, j + 1));
                if (n.remainder(_673).equals(BigDecimal.ZERO)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

}
