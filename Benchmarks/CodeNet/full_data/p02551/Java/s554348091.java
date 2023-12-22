import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        long ans = (n - 2L) * (n - 2L);
        Map<Integer, Integer> rM = new HashMap<>();
        Map<Integer, Integer> cM = new HashMap<>();
        int m = n;
        for (int i = 0; i < q; i++) {
            int type = scan.nextInt();
            int pos = scan.nextInt();
            if (type == 1) {
                if (cM.containsKey(pos)) {
                    ans -= cM.get(pos);
                } else {
                    ans -= n - 2;
                    for (int j = pos + 1; j < m; j++) {
                        cM.put(j, n - 2);
                    }
                    m = pos;
                }
            } else {
                if (rM.containsKey(pos)) {
                    ans -= rM.get(pos);
                } else {
                    ans -= m - 2;
                    for (int j = pos + 1; j < n; j++) {
                        rM.put(j, m - 2);
                    }
                    n = pos;
                }
            }
        }
        System.out.println(ans);
    }
}
