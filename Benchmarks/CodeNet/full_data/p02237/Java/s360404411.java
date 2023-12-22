import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
        Scanner kc = new Scanner(System.in);
    man(kc);
    }
    public static void man(Scanner sc){
    int n = sc.nextInt();
        boolean[][] field = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            int peep = sc.nextInt() - 1;
            int count = sc.nextInt();
            for (int j = 0; j < count; ++j) {
                field[peep][sc.nextInt() - 1] = true;
            }
        }
        StringBuilder ka = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    ka.append(" ");
                }
                if (field[i][j]) {
                    ka.append("1");
                } else {
                    ka.append("0");
                }
            }
            ka.append("\n");
        }
        System.out.print(ka);
}
}
