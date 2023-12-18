import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        List<Long> l = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = 4; j <= 200000; j++) {
                if (i+j > S.length()) break;
                l.add(Long.valueOf(S.substring(i, i+j)));
            }
        }



        int ans = 0;
        for (long s : l) {
            if (s % 2019 == 0) ans++;
        }

        System.out.println(ans);
    }
}
