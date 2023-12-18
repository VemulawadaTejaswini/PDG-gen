import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Boolean[][] list = new Boolean[n][n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list[i][x - 1] = y == 1;
            }
        }

        int ans = 0;

        calc: for (int i = 0; i < Math.pow(2, n) ; i++) {
            Boolean[] values = new Boolean[n];

            int count = 0;
            for (int j = 0; j < n; j++) {
                values[j] = (1 & i >> j) == 1;
                if (values[j]) {
                    count++;
                }
            }

            for (int j = 0; j < n; j++) {
                boolean is1 = (1 & i >> j) == 1;
                Boolean[] target = list[j];
                for (int k = 0; k < n; k++) {
                    if (target[k] == null) {
                        continue;
                    }
                    Boolean a = is1 ? target[k] : !target[k];
                    if (a != values[k]) {
                        continue calc;
                    }
                }
            }
            ans = Math.max(count, ans);
        }

        System.out.println(ans);
    }
}