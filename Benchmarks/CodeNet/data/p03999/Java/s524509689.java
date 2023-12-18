import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String S = sc.next();
        char[] chars = S.toCharArray();

        long sum = 0;
        for (int mask = 0; mask < (1 << (S.length() - 1)); mask++) {
            int prev = 0;
            for (int i = 0; i < S.length(); i++) {
                if (((mask >> i) & 1) == 1) {
                    String num = new String(Arrays.copyOfRange(chars, prev, i + 1));
                    sum += Long.parseLong(num);
                    prev = i + 1;
                }
            }
            String num = new String(Arrays.copyOfRange(chars, prev, S.length()));
            sum += Long.parseLong(num);
        }

        System.out.println(sum);
    }

}