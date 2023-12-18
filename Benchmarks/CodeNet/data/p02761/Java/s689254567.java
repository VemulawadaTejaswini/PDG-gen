import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC157C - Guess The Number

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] s = new int[m];
        int[] c = new int[m];

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
            if (ans[s[i] - 1] == -1 || ans[s[i] -1 ] > c[i]) {
                ans[s[i] -1] = c[i];
            }
        }

        String a = "";
        if (n == 1  || (n > 1 && ans[0] > 0)) {
            for (int i = 0; i < n; i++) {
                if (ans[i] > -1) {
                    a += ans[i];
                } else {
                    a += "0";
                }
            }
        } else {
            a = "-1";
        }

        System.out.println(a);
    }
}