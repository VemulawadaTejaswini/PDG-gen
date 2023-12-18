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


        if (n == x) {
            for (int i = 1; i <= 2 * n - 1; i++) {
                System.out.println(i);
            }
            return;
        }

        boolean underHarf = x < n;
        for (int i = 0; i < (underHarf ? n : n - 1); i++) {
            if (n - i == x) {
                continue;
            }
            System.out.println(n - i);
        }

        System.out.println(x);

        if (!underHarf) {
        }

        for (int i = 0; i < n - 1; i++) {
            if (2 * n - i - 1 == x) {
                continue;
            }
            System.out.println(2 * n - i - 1);
        }

        System.out.println(1);
    }

    private void solveC(Scanner sc) {
        int n = sc.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int k = sc.nextInt();

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main app = new Main();
            // app.solveA(sc);
            app.solveB(sc);
            // app.solveC(sc);
        }
    }
}
