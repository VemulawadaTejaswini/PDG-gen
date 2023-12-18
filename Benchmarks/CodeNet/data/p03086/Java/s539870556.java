import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        int max = 0;
        int cnt = 0;

        for (int i = 0; i < S.length(); i++) {
            final char c = S.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }

        System.out.println(max);
    }
}
