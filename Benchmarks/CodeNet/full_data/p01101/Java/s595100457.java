import java.util.Scanner;

/**
 * Taro
 */
public class Main {

    int n;
    int m;
    int[] costs;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            if (n == 0 && m == 0) {
                return;
            }
            costs = new int[n];
            for (int i = 0; i < n; i++) {
                costs[i] = sc.nextInt();
            }
            boolean[] used = new boolean[n];
            for (int i = 0; i < n; i++) {
                used[i] = false;
            }
            calc();

        }
    }

    public void calc() {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int c = costs[i] + costs[j];
                if (c <= m) {
                    if (max < c) {
                        max = c;
                    }
                }
            }
        }
        System.out.println((max == 0) ? "NONE" : max);
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.scan();
    }
}
