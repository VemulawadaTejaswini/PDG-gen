import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] acnum = new int[n + 1];
        acnum[0] = acnum[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (s[i - 2] == 'A' && s[i - 1] == 'C') {
                acnum[i] = acnum[i - 1] + 1;
            } else {
                acnum[i] = acnum[i - 1];
            }
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(acnum[r] - acnum[l]);
        }
    }
}
