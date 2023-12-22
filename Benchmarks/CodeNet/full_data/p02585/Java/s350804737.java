
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        int[] p = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(scan.next());
            p[i]--;
        }
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = i;
            List<Integer> cList = new ArrayList<Integer>();
            long total = 0;
            while (true) {
                cur = p[cur];
                cList.add(c[cur]);
                total += c[cur];
                if (cur == i) {
                    break;
                }
            }

            if (k <= cList.size()) {
                long max = Long.MIN_VALUE;
                long sum = 0;
                for (int j = 0; j < k; j++) {
                    sum += cList.get(j);
                    max = Math.max(max, sum);
                }
                ans = Math.max(max, ans);
                continue;
            }

            if (total <= 0) {
                long max = Long.MIN_VALUE;
                long sum = 0;
                for (int j : cList) {
                    sum += j;
                    max = Math.max(max, sum);
                }
                ans = Math.max(max, ans);
            } else {
                int loopCount = k / cList.size();
                int amari = k % cList.size();
                long max = total * loopCount;
                ans = Math.max(max, ans);
                long sum = total * loopCount;
                for (int j = 0; j < amari; j++) {
                    sum += cList.get(j);
                    max = Math.max(max, sum);
                }
                ans = Math.max(max, ans);
            }
        }

        System.out.println(ans);
    }
}
