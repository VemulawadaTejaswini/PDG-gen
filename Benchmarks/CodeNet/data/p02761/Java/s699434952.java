import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[] s = new int[m];
        int[] c = new int[m];
        int[] ans = new int[3];
        boolean[] flag = new boolean[3];
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());

            ans[s[i] - 1] = c[i];
            if (flag[s[i] - 1] == false) {
                flag[s[i] - 1] = true;
            } else if (flag[s[i] - 1] == true && ans[s[i] - 1] != c[i]) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        if ((n == 1 && (ans[0] != 0 || ans[1] != 0)) || (n == 2 && (ans[0] != 0 || ans[1] == 0))
                || (n == 3 && (ans[0] == 0))) {
            System.out.println(-1);
            System.exit(0);
        }

        if (n == 3) {
            System.out.print(ans[0]);
        }
        if (n >= 2) {
            System.out.print(ans[1]);
        }
        System.out.println(ans[2]);

        sc.close();
    }
}