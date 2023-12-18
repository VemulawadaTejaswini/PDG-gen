import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> sw = new ArrayList<>();
        for (int i = 0; i < m; ++i) sw.add(new ArrayList<>());

        for (int i = 0; i < m; ++i) {
            int k = sc.nextInt();
            for (int j = 0; j < k; ++j) {
                sw.get(i).add(sc.nextInt() - 1);
            }
        }

        int[] p = new int[m];
        for (int i = 0; i < m; ++i) p[i] = sc.nextInt();

        int res = 0;
        for (int bit = 0; bit < (1<<n); ++bit) {
            boolean flag = true;
            for (int i = 0; i < m; ++i) {
                int cnt = 0;
                for (Integer id : sw.get(i)) {
                    if ((bit & (1<<id)) != 0) ++cnt;
                }
                if (cnt % 2 != p[i]) flag = false;
            }
            if (flag) ++res;
        }

        System.out.println(res);
    }
}