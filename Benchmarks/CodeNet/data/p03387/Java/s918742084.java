import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        int ans = 0;
        int k = 0, g = 0;
        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
            if (n[i] % 2 == 0) {
                k++;
            } else {
                g++;
            }
        }
        if (k > 0 && k < 3) {
            ans++;
            if (k < g) {
                for (int i = 0; i < 3; i++) {
                    if (n[i] % 2 == 0) {
                        continue;
                    }
                    n[i]++;
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (n[i] % 2 == 0) {
                        n[i]++;
                    }
                }
            }
        }
        Arrays.sort(n);
        System.out.println(ans + (n[2] - n[1]) + (n[1] - n[0]) / 2);
    }
}