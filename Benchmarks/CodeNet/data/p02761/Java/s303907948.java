import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] s = new int[m];
            int[] c = new int[m];
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(0);
            }

            for (int i = 0; i < m; i++) {
                s[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }

            String result = "-1";

            int cnt = 0;
            for (int a : s) {
                int index = a - 1;
                int b = list.get(index);

                if (b == 0) {
                    list.set(index, c[cnt]);
                } else if (c[cnt] != b) {
                    System.out.println(result);
                    return;
                }
                cnt++;
            }

            if (list.get(0) == 0) {
                System.out.println(result);
                return;
            }

            StringBuilder sb = new StringBuilder();
            list.forEach(a -> {
                sb.append(a);
            });
            System.out.println(sb.toString());

        }
    }

}