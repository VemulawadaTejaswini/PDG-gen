import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < S.length(); ++i) {
            char s = S.charAt(i);
            if (s == 'A' || s == 'G' || s == 'T' || s == 'C') {
                ++tmp;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 0;
            }
        }

        System.out.println(ans);
    }
}