import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int j = 0; j < n; ++j) a.add(sc.nextInt());
        for (int j = 0; j < n; ++j) b.add(sc.nextInt());
        for (int j = 0; j < n; ++j) c.add(sc.nextInt());
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);

        int res = 0;
        for (int i = 0; i < n; ++i) {

            int val = b.get(i);
            int left = -1;
            int right = n;
            while (Math.abs(right - left) > 1) {
                int mid = (left + right) / 2;
                if (val <= a.get(mid)) right = mid;
                else left = mid;
            }
            int tmp1 = right;

            left =  -1;
            right = n;
            while (Math.abs(right - left) > 1) {
                int mid = (left + right) / 2;
                if (val >= c.get(mid)) left = mid;
                else right = mid;
            }
            int tmp2 = n - right;

            res += tmp1 * tmp2;

        }

        System.out.println(res);
    }
}
