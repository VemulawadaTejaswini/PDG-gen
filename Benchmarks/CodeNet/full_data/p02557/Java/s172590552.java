

import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            arr2[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
//        map.put(1, 2);
//        map.put(2, 3);
//        for (int k : map.keySet()) {
//            debug(k);
//        }
        int[] ans = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            boolean outer = false;
            for (int b  : map.keySet()) {
                if (a != b) {
                    int count = map.get(b) - 1;
                    if (count == 0) {
                        map.remove(b);
                    } else {
                        map.put(b, count);
                    }
                    ans[i] = b;
                    outer = true;
                    break;
                }
            }
            if (outer) {
                continue;
            }
            if (cur >= n) {
                break;
            }
            int b = arr2[cur];
            cur++;

            while (a == b) {
//                debug(b);
                map.put(b, map.getOrDefault(b, 0) + 1);
                if (cur >= n) {
                    outer = true;
                    break;
                }
                b = arr2[cur];
                cur++;
            }
            if (outer) {
                break;
            }
            ans[i] = b;
        }
        if (!map.isEmpty()) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        out.print(ans[0]);
        for (int i = 1; i < n; i++) {
            out.print(" ");
            out.print(ans[i]);
        }

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
