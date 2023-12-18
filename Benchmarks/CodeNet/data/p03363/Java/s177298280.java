import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] as = new int[n + 1];
        as[0] = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            as[i + 1] = as[i] + tmp;
        }

        Arrays.sort(as);
        int count = 0;
        int tmp = 0;
        for (int i = 1; i < n + 1; i++) {
            if (as[i - 1] == as[i]) {
                tmp++;
                count += tmp;
            } else {
                tmp = 0;
            }
        }
        System.out.println(count);
    }
}