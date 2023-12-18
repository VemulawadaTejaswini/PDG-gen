import java.util.Scanner;
import java.math.BigDecimal;

class Main {
    static char calc(String str, int index) {
        char answer = str.charAt(0);

        if (str.charAt(0) == '1') {
            int lastIndex = 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    lastIndex = i;
                } else {
                    break;
                }
            }

            if (index - 1 <= lastIndex) {
                answer = '1';
            } else {
                answer = str.charAt(lastIndex + 1);
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        String S;
        BigDecimal K;

        Scanner sc = new Scanner(System.in);
        S = sc.next();
        K = new BigDecimal(sc.next());

        System.out.println(calc(S, K.intValue()));
    }
}
