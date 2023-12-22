import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        boolean ok[] = new boolean[n];
        Arrays.fill(ok, true);
        for (int i = 0; i < n - 1; i++) {
            if (ok[i] == false) continue;
            if (a[i] == a[i + 1]) ok[i] = false;
            for (int j = i + 1; j < n; j++) {
                if (ok[j] == true && a[j] % a[i] == 0) {
                    ok[j] = false;
                }
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            if (ok[i] == true) total++;
        }

        System.out.println(total);
    }
}
