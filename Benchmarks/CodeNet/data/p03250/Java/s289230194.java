import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 *
 */
public class Main {

    private static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a * 9, Math.max(b * 9, c * 9));
        System.out.println(max + a + b + c);
    }

    public static void main(String args[]) {

        solve(new Scanner(System.in));
    }
}
