import java.math.BigDecimal;
import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<int[]> data = new ArrayList<>();

        for (int i=0; i < m; i++) {
            int[] add = new int[3];
            add[0] = sc.nextInt();
            add[1] = sc.nextInt();
            add[2] = sc.nextInt();
            data.add(add);
        }

        int[] known = new int[n];
        for (int i=0; i < n; i++) {
            known[i] = 0;
        }

        // check for data like 1, 2, 2 => 1 is even
        // 1, 1, 1 => 1 is even
        Iterator<int[]> it = data.iterator();
        while (it.hasNext()) {
            int[] d = it.next();
            int c1 = check1(d);
            if (c1 != -1) {
                known[c1-1] = 2;
                it.remove();
            } else if (same(d)) {
                known[d[0]-1] = 2;
                it.remove();
            }
        }

        Set<Integer> hasData = new HashSet<>();
        for (int[] d : data) {
            hasData.add(d[0]);
            hasData.add(d[1]);
            hasData.add(d[2]);
        }

        // System.out.println(Arrays.toString(known));
        int ans = 0;
        for (int i : known) {
            if (i == 0)
                ans++;
        }

        if (hasData.size() > 0)
            ans -= (hasData.size()-2);

        System.out.println(ans);
    }

    private static int check1(int[] d) {
        if (d[0] != d[1] && d[1] == d[2]) {
            return d[0];
        } else if (d[1] != d[0] && d[0] == d[2]) {
            return d[1];
        } else if (d[2] != d[0] && d[0] == d[1]) {
            return d[2];
        }
        return -1;
    }

    private static boolean diff(int[] d) {
        for (int i=0; i < d.length; i++) {
            for (int j=d.length-1; j > i; j--) {
                if (d[i] == d[j])
                    return false;
            }
        }
        return true;
    }

    private static boolean same(int[] d) {
        return d[0] == d[1] && d[1] == d[2];
    }


}
