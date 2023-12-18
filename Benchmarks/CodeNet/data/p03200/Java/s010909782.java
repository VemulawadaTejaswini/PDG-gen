import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.length();
        int wc = 0;
        int ans = 0;
        for (int i = 0; i < a; i++) {
            char target = s.charAt(a - 1 - i);
            if (target == 'W') {
                wc++;
            } else if (target == 'B') {
                ans += wc;
            }
        }
        System.out.println(ans);
    }
}