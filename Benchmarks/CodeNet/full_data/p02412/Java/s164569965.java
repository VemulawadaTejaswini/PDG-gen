import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int nex_combination(int sub) {
        int x = sub & (-sub);
        int y = sub + x;
        return (((sub & ~y) / x) >> 1) | y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (n == 0 && x == 0) {
                break;
            }

            int ans = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
