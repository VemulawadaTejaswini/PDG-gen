import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.next();
        }

        boolean[] solved = new boolean[n];
        int ac = 0;
        int wa = 0;
        for (int i = 0; i < m; i++) {
            if (solved[p[i] - 1]) {
                continue;
            }
            if ("AC".equals(s[i])) {
                ac++;
                solved[p[i] - 1] = true;
                continue;
            }
            wa++;
        }
        System.out.println(ac + " " + wa);
    }

}
