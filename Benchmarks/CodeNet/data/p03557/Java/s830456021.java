import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < n; ++j) {
                int val = sc.nextInt();
                if (i == 0) a.add(val);
                if (i == 1) b.add(val);
                if (i == 2) c.add(val);
            }
        }
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
            System.out.println(tmp1);

            left =  -1;
            right = n;
            while (Math.abs(right - left) > 1) {
                int mid = (left + right) / 2;
                if (val >= c.get(mid)) left = mid;
                else right = mid;
            }
            int tmp2 = n - right;
            System.out.println(tmp2);

            res += tmp1 * tmp2;

        }

        System.out.println(res);
    }
}