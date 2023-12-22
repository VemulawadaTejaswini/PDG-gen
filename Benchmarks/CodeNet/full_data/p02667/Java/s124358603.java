import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.next();

        long n = t.length();
        long count = 0;
        if (n % 2 == 0) {
            count = n / 2 * (1 + n / 2);
        } else {
            count = (n + 1) / 2 * (1 + (n + 1) / 2) - (n + 1) / 2;
        }

        long minus = 0;
        int minusCount = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == '0') {
                if ((i + 1 - minusCount) % 2 == 1) {
                    minus += minusCount / 2 + 1;
                    minusCount++;
                } else {
                    minus += minusCount / 2;
                }
            }
        }

        System.out.println(count - minus);
    }
}