import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] as = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            as[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int iLikeToNo = as[i];
            int jLikeToNo = as[iLikeToNo];
            if (iLikeToNo > i && jLikeToNo == i) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
