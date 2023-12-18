import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String abcd = sc.next();
        int n = abcd.length() - 1;
        StringBuilder res = null;
        for (int bit = 0; bit < (1 << n); bit++) {
            res = new StringBuilder();
            res.append(abcd.charAt(0));
            int ans = 0;
            for (int i = 0; i < n; i++) {
                char num = abcd.charAt(i);
                if ((bit>> i & 1 ) != 0) {
                    res.append('+');
                    res.append(num);
                    ans += num - '0';
                } else {
                    res.append('-');
                    res.append(num);
                    ans -= num - '0';
                }
            }
            if (ans == 7) {
                break;
            }
        }
        System.out.println(res.toString() + "=7");
    }
}
