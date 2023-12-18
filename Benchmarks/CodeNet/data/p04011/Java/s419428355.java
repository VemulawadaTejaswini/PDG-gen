

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        int ans = 0;

        for (int i=1; i <= n; i++) {
            if (i <= k) {
                ans += x;
            } else {
                ans += y;
            }
        }
        System.out.print(ans);
    }
}
