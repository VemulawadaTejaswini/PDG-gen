
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String lis[] = {
            "dream", "dreamer", "erase", "eraser"
        };
        while (true) {
            if (s.length() == 0) {
                System.out.println("YES");
                return;
            }
            boolean updated = false;
            for (int i = 0; i < 4; ++i) {
                String k = lis[i];
                if (s.length() >= k.length()) { //  && s.substring(s.length() - k.length(), s.length()).equals(k)) {
                    boolean ok = true;
                    for (int j = k.length() - 1; j >= 0; --j) {
                        if (k.charAt(j) == s.charAt(s.length() - k.length() + j)) {
                            // ok
                        } else {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        s = s.substring(0, s.length() - k.length());
                        updated = true;
                        break;
                    }
                } else {
                    continue;
                }
            }
            if (!updated) {
                System.out.println("NO");
                return;
            }
        }
    }
}
