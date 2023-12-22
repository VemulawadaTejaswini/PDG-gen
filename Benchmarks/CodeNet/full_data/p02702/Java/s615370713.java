import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        List<Integer> s4 = new ArrayList<>();
        for (int i = 0; i <= S.length() - 4; i++) {
            s4.add(Integer.valueOf(S.substring(i, i+4)));
        }
        List<Integer> s5 = new ArrayList<>();
        for (int i = 0; i <= S.length() - 5; i++) {
            s4.add(Integer.valueOf(S.substring(i, i+5)));
        }
        List<Integer> s6 = new ArrayList<>();
        for (int i = 0; i <= S.length() - 6; i++) {
            s4.add(Integer.valueOf(S.substring(i, i+6)));
        }

        int ans = 0;
        for (int s : s4) {
            if (s % 2019 == 0) ans++;
        }
        for (int s : s5) {
            if (s % 2019 == 0) ans++;
        }
        for (int s : s6) {
            if (s % 2019 == 0) ans++;
        }

        System.out.println(ans);
    }
}
