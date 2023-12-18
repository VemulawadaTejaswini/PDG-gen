package app;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n > 100) {

            return;
        }
        int ans = 0;

        for (int index = 1; index <= n; index++) {

            ans += index;
        }
        // ロジック
        System.out.println(ans);
    }
}
