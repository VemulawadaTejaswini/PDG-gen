import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 4) {
            System.out.println(0);
            return;
        }
        long ans = 0;
        for (int i = 0; i < s.length() - 3; i++) {
            for (int j = i + 4; j <= s.length(); j++) {
                BigDecimal num = new BigDecimal(s.substring(i, j));
                if (num.remainder(new BigDecimal(2019)).equals(new BigDecimal(0))) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}