
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 0 && n == 0) break;
            List<boolean[]> data = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                boolean[] d = new boolean[m];
                for (int j = 0; j < m; j++) {
                    if (s.charAt(j) == '1')
                        d[j] = true;
                    else d[j] = false;
                }
                data.add(d);
            }
            System.out.println(solve(data, 0, m));
        }
    }

    private static int solve(List<boolean[]> data, int time, int size) {
        if (data.size() == 1) return 0;
        if (data.size() == 2) return 1;
        if (data.size() == 3) return 2;
        int o = 0, z = 0, min = 12;
        for (int i = 0; i < size; i++) {
            List<boolean[]> zero = new ArrayList<>();
            List<boolean[]> one = new ArrayList<>();
            for (boolean[] a : data) {
                if (a[i]) one.add(a);
                else zero.add(a);
            }
            if (one.size() == 0 || zero.size() == 0) continue;
            o = solve(one, time + 1, size);
            z = solve(zero, time + 1, size);
            if (o >= z && o < min) min = o;
            else if (z > o && z < min) min = z;
        }
        return min + 1;
    }
}
