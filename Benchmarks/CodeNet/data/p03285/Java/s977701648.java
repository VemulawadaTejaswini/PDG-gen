import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean ans = false;

        for (int i = 0; i <= n / 4; i++) {
            for (int j = 0; j <= n / 7; j++) {
                if (4 * i + 7 * j == n) {
                    ans = true;
                }
            }
            if (ans) {
                break;
            }
        }
        System.out.println(ans ? "Yes":"No");
    }
}