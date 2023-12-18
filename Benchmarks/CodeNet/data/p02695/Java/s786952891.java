
import java.util.*;

public class Main {
    int n, m, q;
    int[][] qArr;
    int max;
    List<Integer> list;
    void run() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();
        qArr = new int[q][4];
        for (int i = 0; i < q; i++) {
            qArr[i] = new int[]{sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt(), sc.nextInt()};
        }

        for (int i = 0 ;i < m; i++) {
            list = new ArrayList<>();
            dfs(i);
        }

//        for (int bit = 0; bit < (1 << m); bit++) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < m; i++) {
//                if ((bit & (1 << i)) != 0) {
//                    list.add(i);
//                }
//            }
//            if (list.size() != n) {
//                continue;
//            }
//            debug(list);
//
//            int ans = 0;
//            for (int i = 0; i < q; i++) {
//                int[] arr = qArr[i];
//                if (list.get(arr[1]) - list.get(arr[0]) == arr[2]) {
////                    debug(arr);
//                    ans += arr[3];
//                }
//            }
//            max = Math.max(max, ans);
//        }

        System.out.println(max);
    }

    void dfs(int i) {
        list.add(i);
//        debug(list);
        if (list.size() == n) {
            int ans = 0;

            for (int j = 0; j < q; j++) {
//                debug("fuga");
                int[] arr = qArr[j];
                if (list.get(arr[1]) - list.get(arr[0]) == arr[2]) {
                    ans += arr[3];
                }
            }
            max = Math.max(max, ans);
//            debug("max", max, list);
            return;
        }
        for (int j = i ; j < m; j++) {
            dfs(j);
//            debug(j, list);
            list.remove(list.size() - 1);
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
