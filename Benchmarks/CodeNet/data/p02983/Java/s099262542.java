import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());

        int res = Integer.MAX_VALUE;
        int ini1 = 0;
        for (int i = L; i <= R; i++) {
            int m1 = i % 2019;
            if (i == L) {
                ini1 = m1;
            } else if (ini1 == m1) {
                break;
            }


            int ini2 = 0;
            for (int j = i; j <= R; j++) {
                int m2 = j % 2019;
                if (j == i) {
                    ini2 = m2;
                } else if (ini2 == m2) {
                    break;
                }
                res = Math.min(res, m1 * m2);
            }
        }

        System.out.println(res);
    }
}
