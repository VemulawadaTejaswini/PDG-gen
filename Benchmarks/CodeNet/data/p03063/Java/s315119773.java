
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        //fix start - 1
        int ans1 = 0;
        char last = s.charAt(0);
        for (int i = 1; i < n; ++i) {
            if (s.charAt(i) == '.' && last == '#') {
                ++ans1;
                last = '#';
            } else {
                last = s.charAt(i);
            }
        }
        int ans2 = 0;
        last = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; --i) {
            if (last == '.' && s.charAt(i) == '#') {
                ++ans2;
                last = '.';
            } else {
                last = s.charAt(i);
            }
        }
        System.out.println(Math.min(ans1, ans2));

    }
}
