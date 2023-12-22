import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        BigDecimal year = BigDecimal.valueOf(2019);
        int ans =0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                BigDecimal n = BigDecimal.valueOf(Long.valueOf(S.substring(i, j)));
                if(n.remainder(year).equals(BigDecimal.ZERO)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

}
