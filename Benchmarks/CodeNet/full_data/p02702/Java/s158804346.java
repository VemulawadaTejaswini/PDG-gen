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
        a:
        for (int i = s.length(); i >= 3; i--) {
            for (int j = i - 3; j >= 0; j--) {
                BigDecimal num = new BigDecimal(s.substring(j, i));
                if (num.toString().length() == 3 && !num.remainder(new BigDecimal(19)).equals(new BigDecimal(0))) {
                    continue a;
                }
                if (num.remainder(new BigDecimal(2019)).equals(new BigDecimal(0))) {
                    ans++;
                    continue a;
                }
            }
        }
        System.out.println(ans);
    }
}