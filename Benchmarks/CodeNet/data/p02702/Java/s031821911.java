import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        List<Integer> list = new ArrayList<>();
        long ans = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            int temp = Integer.parseInt(s.substring(i, i + 3));
            if (temp % 19 == 0) {
                list.add(i + 3);
            }
        }
        b: for (int idx : list) {
            for (int j = idx - 3; j >= 0; j--) {
                BigDecimal num = new BigDecimal(s.substring(j, idx));
                if (set.contains(num)) {
                    ans++;
                    continue b;
                }
                if (num.toString().length() == 3 && !num.remainder(new BigDecimal(19)).equals(new BigDecimal(0))) {
                    continue b;
                }
                if (num.remainder(new BigDecimal(2019)).equals(new BigDecimal(0))) {
                    set.add(num);
                    ans++;
                    continue b;
                }
            }
        }
        System.out.println(ans);
    }
}