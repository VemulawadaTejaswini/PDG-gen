import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int digit_100 = N / 100;
        int digit_10 = (N / 10) % 10;
        int digit_1 = N % 10;

        int ans = 0;
        if (digit_1 > digit_100) {
            ans = (digit_100 + 1) * 100 + (digit_100 + 1) * 10 + (digit_100 + 1);
        } else if (digit_100 >= digit_10 && digit_100 >= digit_1) {
            ans = digit_100 * 100 + digit_100 * 10 + digit_100;
        } else if (digit_100 < digit_10 && digit_100 < digit_1) {
            ans = (digit_100+1) * 100 + (digit_100+1) * 10 + (digit_100+1);
        } else if (digit_10 < digit_100 && digit_10 < digit_1) {
            int middle = Math.min(digit_100, digit_1);
            ans = middle * 100 + middle * 10 + middle;
        } else if (digit_10 >= digit_100 && digit_10 >= digit_1) {
            ans = digit_10 * 100 + digit_10 * 10 + digit_10;
        } else {
            ans = digit_1 * 100 + digit_1 * 10 + digit_1;
        }

        System.out.println(ans);

    }
}