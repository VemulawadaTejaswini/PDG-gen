import java.util.Scanner;

public class Main {

    private void solveA(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        int min = 0;
        for (int i = 1; i <= n; i++) {
            String check = t.substring(0, i);
            if (s.endsWith(check)) {
                min = i;
            }
        }
        System.out.println(n * 2 - min);
    }

    private void solveB(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();

        if (x == 1 || x == 2 * n - 1) {
            System.out.println("No");
            return;
        }

        int[] nums = new int[2 * n - 1];
        for (int i = 1; i <= 2 * n - 1; i++) {
            nums[i - 1] = i;
        }

        if (n == x) {
            for (int num : nums)
                System.out.println(num);
            return;
        }

        boolean underHarf = x < n;
        int adjuster = 0;
        for (int i = 0; i < (underHarf ? n : n - 1); i++) {
            if (n - i == x) {
                adjuster = 1;
                continue;
            }
            nums[i - adjuster] = n - i;
        }

        nums[n - 1] = x;
        adjuster = 0;

        if (!underHarf) {
            nums[n] = 1;
            adjuster = -1;
        }

        for (int i = 0; i < n - 1; i++) {
            if (2 * n - i - 1 == x) {
                adjuster = 1;
                continue;
            }
            nums[i + n - adjuster] = 2 * n - i - 1;
        }

        for (int num : nums)
            System.out.println(num);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main app = new Main();
            // app.solveA(sc);
            app.solveB(sc);
        }
    }
}
