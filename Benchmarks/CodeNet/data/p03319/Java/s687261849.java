import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int oneIndex = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                oneIndex = i;
                break;
            }
        }

        if (n == k) {
            System.out.println(1);
            return;
        }

        int numRightOfOne = n - oneIndex - 1;
        int numLeftOfOne = oneIndex;
        int ans = 0;

        if (numRightOfOne == k) {
            ans++;
        } else {
            ans += numRightOfOne % (k - 1) == 0 ? numRightOfOne / (k - 1) : numRightOfOne / (k - 1) + 1;
        }

        if (numLeftOfOne == k) {
            ans++;
        } else {
            ans += numLeftOfOne % (k - 1) == 0 ? numLeftOfOne / (k - 1) : numLeftOfOne / (k - 1) + 1;
        }
        System.out.println(ans);
    }
}
