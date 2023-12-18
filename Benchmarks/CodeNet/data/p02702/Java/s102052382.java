import java.math.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long cnt = 0;
        for (int i = 0; i < s.length() - 4; i++) {
            for (int j = i + 3; j <= s.length(); j++) {
                long tmp = Long.parseLong(s.substring(i, j));
                if (tmp % 2019 == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
