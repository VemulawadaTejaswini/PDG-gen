import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];

        int[] num = new int[n + 1];
        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (num[s[i]] != 0 && num[s[i]] != c[i]) {
                System.out.println(-1);
                return;
            }
            num[s[i]] = c[i];
        }
        if (num[1] == 0) {
            System.out.println(-1);
            return;
        }
        int ans = 0;
        for (int i = 1; i < num.length; i++) {
            ans += num[i] * Math.pow(10, num.length - i - 1);
        }
        System.out.println(ans);
    }

}
