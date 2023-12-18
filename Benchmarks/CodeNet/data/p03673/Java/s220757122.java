import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        if (n % 2 == 0) {
            // 偶数の場合、左右の順で詰める
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    r.add(a[i]);
                } else {
                    l.add(a[i]);
                }
            }
        } else {
            // 奇数の場合、右左の順で詰める
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    l.add(a[i]);
                } else {
                    r.add(a[i]);
                }
            }
        }

        for (int i = l.size() - 1; i >= 0; i--) {
            System.out.println(l.get(i));
        }

        System.out.println(a[0]);

        for (int i = 0; i < r.size(); i++) {
            System.out.println(r.get(i));
        }
    }
}
