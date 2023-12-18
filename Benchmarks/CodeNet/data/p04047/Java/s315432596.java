import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        Integer[] ls= new Integer[2*n];
        for (int i = 0; i < 2*n; i++) {
            ls[i] = sc.nextInt();
        }
        Arrays.sort(ls, Comparator.reverseOrder());
        int ans = 0;
        for (int i = 1; i < 2 * n; i += 2) {
            ans += ls[i];
        }
        System.out.println(ans);
    }
}