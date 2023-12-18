

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int ones = 0;
        int zeros = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                if (ones > 0) {
                    --ones;
                } else {
                    ++zeros;
                }
            } else {
                if (zeros > 0) {
                    --zeros;
                } else {
                    ++ones;
                }
            }
        }
        int res = s.length() - (zeros + ones);
        System.out.println(res);
    }
}
