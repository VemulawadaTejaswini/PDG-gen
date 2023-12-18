import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[] num = new int[n + 1];
        Arrays.fill(num, -1);
        for (int i = 0; i < m; i++) {
            if (num[s[i]] != -1 && num[s[i]] != c[i]) {
                System.out.println(-1);
                return;
            }
            num[s[i]] = c[i];
        }
        for (int i = 1; i < num.length; i++) {
            if (num[1] == 0) {
                System.out.println(-1);
                return;
            }
            if (num[i] == -1) {
                if (i == 1 && i + 1 < num.length) {
                    num[i] = 1;
                    continue;
                }
                num[i] = 0;
            }
        }
        int ans = 0;
        for (int i = 1; i < num.length; i++) {
            ans += num[i] * Math.pow(10, num.length - i - 1);
        }
        System.out.println(ans);
    }

}
