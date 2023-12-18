import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int lower_bound(List<Integer> list, int key) {
        int l = -1;
        int h = list.size();

        while (h - l > 1) {
            int m = (h + l) / 2;
            if (list.get(m) >= key) {
                h = m;
            } else {
                l = m;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> l = new ArrayList<>();
        l.add(sc.nextInt());
        for (int i = 1; i < N; i++) {
            int n = sc.nextInt();
            int lbIdx = lower_bound(l, n);
            if (lbIdx == l.size()) {//key is bigger than biggest , overwrite biggest
                l.set(l.size() - 1, n);
            }else if (l.get(lbIdx) == n) {//found the same number, insert
                if (lbIdx > 0) {
                    l.set(lbIdx - 1, n);
                } else {
                    l.add(0, n);
                }
            } else {// key is smaller than lower bound
                if (lbIdx > 0) {
                    l.set(lbIdx - 1, n);
                } else {
                    l.add(0, n);
                }
            }
        }

        System.out.println(l.size());
        ;

    }

}