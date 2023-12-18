
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        boolean[] one = new boolean[s.length()];
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                if (s.charAt(i) == '1')
                    one[i] = true;
            } else {
                one[i] = s.charAt(i) == '1' && one[i - 1];
            }

            if (num == 0 && s.charAt(i) != '1')
                num = s.charAt(i) - '0';
        }
        if (k > one.length) {
            System.out.println(num);
        } else {
            if (one[(int) (k - 1)])
                System.out.println(1);
            else
                System.out.println(num);
        }
    }

}
