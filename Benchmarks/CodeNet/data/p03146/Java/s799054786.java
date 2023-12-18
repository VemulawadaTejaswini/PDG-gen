import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int s = in.nextInt();

            boolean[] used = new boolean[1 << 20];

            int a = s;
            int n = 1;
            used[a] = true;

            for (;;) {
                a = f(a);
                n++;
                if (used[a]) {
                    System.out.println(n);
                    return;
                }
                used[a] = true;
            }
        }
    }

    private static int f(int n) {
        return n % 2 == 0 ? (n / 2) : (3 * n + 1);
    }
}
