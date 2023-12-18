
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int k = in.nextInt();

        if (n == 2) {
            System.out.println(-1);
            return;
        }

        final int max = n - 2;
        final int min = 1;
        if (k > n - 2 || k < min) {
            System.out.println(-1);
            return;
        }

        final int needToClear = max - k;

        final int newLine = ((n - 1) + (n - 1 - needToClear)) * needToClear / 2;
        final int m = n - 1 + newLine;
        System.out.println(m);
        for (int i = 0; i < n - 1; i++) {
            System.out.println((i + 1) + " " + (i + 2));
        }
        int count = 0;
        boolean enough = newLine == 0;
        for (int i = 1; !enough && i <= n; ++i) {
            for (int j = i + 2; !enough && j <= n; ++j) {
                System.out.println(i + " " + j);
                count++;
                if (count >= newLine) {
                    enough = true;
                }
            }
        }
    }
}
