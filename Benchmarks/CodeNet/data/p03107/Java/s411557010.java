import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        q_3();
    }

    private static void q_1() {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            System.out.println(b / a < c ? b / a : c);
        }
    }

    private static void q_2() {
        try(Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int min = Math.min(a, b);

            int cnt = 0;
            for (; min >= 1; min--) {
                if (a % min == 0 && b % min == 0) {
                    cnt ++;
                    if(cnt == c) {
                        break;
                    }
                }
            }

            System.out.println(min);
        }
    }

    private static void q_3() {
        try(Scanner scan = new Scanner(System.in)) {

                String s = scan.next();
                int zero = 0;
                int one = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        zero++;
                    } else {
                        one++;
                    }
                }
                System.out.println(Math.min(zero, one) * 2);

        }
    }
}
