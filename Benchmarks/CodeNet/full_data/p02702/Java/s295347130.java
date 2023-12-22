import java.util.Scanner;

/**
 * 逆元を利用する
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int total = 0;

        int[] count = new int[2019];
        int ans = 0;

        for (int i = 1; i <= s.length(); i++) {
            count[total]++;
            total += (s.charAt(s.length() - i) - '0') * (int) (Math.pow(10, i - 1) % 2019);
            total %= 2019;
            ans += count[total];
        }

        System.out.println(ans);
    }
}