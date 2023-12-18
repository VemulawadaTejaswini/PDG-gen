import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }

        LinkedList<Long> list = new LinkedList<>();
        list.add(a[0]);
        for (int i = 1; i < n; i++) {
            if (list.peekFirst() >= a[i]) {
                list.add(0, a[i]);
            } else {
                int index = ub(list, a[i]) - 1;
                list.set(index, a[i]);
            }
        }
        System.out.println(list.size());
    }

    static int ub(List<Long> arr, long x) {
        int ok = arr.size();
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (arr.get(mid) > x) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }
}
