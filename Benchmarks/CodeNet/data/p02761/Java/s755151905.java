import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[] s = new int[m];
        int[] c = new int[m];
        boolean[] flag = new boolean[3];
        int[] ans = new int[3];
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(sc.next()) - 1;
            c[i] = Integer.parseInt(sc.next());
            if (flag[s[i]] == false) {
                flag[s[i]] = true;
                ans[s[i]] = c[i];
            } else {
                if (ans[s[i]] != c[i]) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        if (n == 3) {
            if (ans[0] == 0) {
                System.out.println(-1);
                System.exit(0);
            }
            System.out.print(ans[0]);
            System.out.print(ans[1]);
            System.out.println(ans[2]);
        } else if (n == 2) {
            if (ans[0] == 0) {
                System.out.println(-1);
                System.exit(0);
            }
            System.out.print(ans[0]);
            System.out.println(ans[1]);
        } else {
            System.out.println(ans[0]);
        }

        sc.close();
    }
}