import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int max = -1;
        for (int i = 1; i <= s.length() - 1; i++) {
            String x = s.substring(0, i);
            String y = s.substring(i, s.length());

            int xs[] = new int[26];
            int ys[] = new int[26];
            Arrays.fill(xs, 0);
            Arrays.fill(ys, 0);
            for (int j = 0; j < x.length(); j++) {
                xs[x.charAt(j) - 'a'] = 1;
            }
            for (int j = 0; j < y.length(); j++) {
                ys[y.charAt(j) - 'a'] = 1;
            }

            int total = 0;
            for (int j = 0; j < 26; j++) {
                if (xs[j] == 1 & ys[j] == 1) {
                    total++;
                }
            }

            max = Math.max(total, max);
        }

        System.out.println(max);
    }
}
