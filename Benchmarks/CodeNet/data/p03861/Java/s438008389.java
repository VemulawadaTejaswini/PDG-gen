import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    private void solveX(BufferedReader sc) throws IOException {
        String line = sc.readLine();
        print(line);
    }

    private void print(String elem) {
        String[] line = elem.split(" ");
        long a = Long.parseLong(line[0]);
        long b = Long.parseLong(line[1]);
        long x = Long.parseLong(line[2]);

        long all = b / x;
        long outer = a / x;
        System.out.println(all - outer + (a % x == 0 ? 1 : 0));
    }

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

    private void solveB(BufferedReader sc) throws IOException {
        String[] line = sc.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);

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
        long k = sc.nextLong();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // try (Scanner sc = new Scanner(System.in)) {
        Main app = new Main();
        // app.solveA(sc);
         app.solveX(br);
//        app.print("4 8 2");
//        app.print("1 1 1");
//        app.print("9 9 3");
//        app.print("1 1000000000000000000 3");
        // app.solveC(sc);
        // }
    }
}
