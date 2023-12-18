import java.util.*;

public class Main {
    public static void run(int C[][]) {
        int r[] = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int d = C[i][j] - C[i][j == 2 ? 0 : j + 1];
                if (i == 0) {
                    r[j] = d;
                } else if (d != r[j]) {
                    System.out.println("No");
                    return;
                }
            }
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                int d = C[i][j] - C[i == 2 ? 0 : i + 1][j];
                if (j == 0) {
                    r[i] = d;
                } else if (d != r[i]) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }

    public static void runInput() {
        Scanner scanner = new Scanner(System.in);

        int C[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = scanner.nextInt();
            }
        }

        run(C);
    }

    public static void main(String args[]) {
        runInput();

    }
}
