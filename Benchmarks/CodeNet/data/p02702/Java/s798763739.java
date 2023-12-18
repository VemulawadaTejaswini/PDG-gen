import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        List<String> l = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = 4; j <= 200000; j++) {
                if (i+j > S.length()) break;
                l.add(S.substring(i, i+j));
            }
        }



        int ans = 0;
        for (String s : l) {
            if (Long.valueOf(s) % 2019 == 0) ans++;
        }

        System.out.println(ans);
    }
}
