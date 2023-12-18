import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int maxIndex = 0;
        int[] ps = new int[n];
        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt();
            if (ps[i] > ps[maxIndex]) {
                maxIndex = i;
            }
        }
        ps[maxIndex] /= 2;
        int ans = 0;
        for (int p : ps) {
            ans += p;
        }
        System.out.println(ans);
    }
}