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
        for (int i = 0; i < s.length() - 3; i++) {
            for (int j = i + 4; j <= s.length(); j++) {
                BigDecimal num = new BigDecimal(s.substring(i, j));
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