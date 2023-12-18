import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 4) {
            System.out.println(0);
            return;
        }
        long ans = 0;
        for (int i = 0; i < s.length() - 3; i++) {
            for (int j = i + 4; j <= s.length(); j++) {
                long num = Long.parseLong(s.substring(i, j));
                if (num % 2019 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}