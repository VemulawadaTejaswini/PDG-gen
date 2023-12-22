import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int m = sc.nextInt(), n = sc.nextInt();
            if ((m | n) == 0) {
                break;
            }
            int[] r = new int[n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++)
                    r[j] += sc.nextInt();
            }
            int[] t = r.clone();
            Arrays.sort(r);
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    if (r[i] == t[j]) {
                        System.out.print((j + 1) + (i > 0 ? " " : "\n"));
                        t[j]=-1;
                    }
                }
            }
        }
    }
}
