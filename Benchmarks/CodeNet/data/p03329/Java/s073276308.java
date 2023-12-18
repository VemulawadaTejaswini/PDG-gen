import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int ans = 0;
        while (n >= 6) {
            int pow9 = 9;
            int i = 1;
            while (n >= pow9) {
                pow9 = (int) Math.pow(9, i);
                i++;
            }
            pow9 /= 9;

            int pow6 = 6;
            i = 1;
            while (n >= pow6) {
                pow6 = (int) Math.pow(6, i);
                i++;
            }
            pow6 /= 6;
            n -= pow9 > pow6 && n >= 9 ? pow9 : pow6;
            ans++;
        }
        System.out.println(ans + n);
    }
}