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
        count[0]++;
        int ans = 0;
        int ten = 1;

        for (int i = 1; i <= s.length(); i++) {
            total += (s.charAt(s.length() - i) - '0') * ten;
            ten = ten * 10 % 2019;
            total %= 2019;
            count[total] += 1;
        }

        for (int i = 0; i < 2019; i++) {
            ans += count[i] * (count[i] - 1) / 2;
        }

        System.out.println(ans);
    }
}