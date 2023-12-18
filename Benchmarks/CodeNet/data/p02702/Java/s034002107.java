import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 4) {
            System.out.println(0);
            return;
        }
        Set<BigDecimal> set = new HashSet<>();
        long ans = 0;
        a : for (int i = s.length(); i >= 3; i--) {
            for (int j = i - 3; j >= 0; j--) {
                BigDecimal num = new BigDecimal(s.substring(j, i));
                if (num.toString().length() == 3 && !num.remainder(new BigDecimal(19)).equals(new BigDecimal(0))) {
                    continue a;
                }
                if (set.contains(num)) {
                    ans++;
                    continue;
                }
                if (num.remainder(new BigDecimal(2019)).equals(new BigDecimal(0))) {
                    set.add(num);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}