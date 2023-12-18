import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] ans = new int[n];
        for (int i = 0; i < q; i++) {
            ans[sc.nextInt() - 1]++;
        }

        for (int i = 0 ; i < n; i++) {
            int correct = ans[i];
            System.out.println(k - (q - correct) > 0 ? "Yes" : "No");
        }
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
