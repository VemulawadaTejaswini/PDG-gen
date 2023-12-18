
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    int n;
    long w;
    long[] vs;
    long[] ws;
    ArrayList<ArrayList<Long>> is;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextLong();
        vs = new long[n];
        ws = new long[n];
        is = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) is.add(new ArrayList<>());
        for (int i = 0; i < n; i++) {
            ws[i] = sc.nextLong();
            vs[i] = sc.nextLong();
            int j = (int) (ws[i] - ws[0]);
            is.get(j).add(vs[i]);
        }

        for (int i = 0; i < 4; i++)
            is.get(i).sort(Comparator.reverseOrder());
    }

    private void solve() {
        long ans = 0;
        long weight, tmp;
        for (int i = 0; i <= is.get(0).size(); i++) {
            for (int j = 0; j  <= is.get(1).size(); j++) {
                for (int k = 0; k <= is.get(2).size(); k++) {
                    for (int l = 0; l <= is.get(3).size(); l++) {
                        weight = ws[0] * i + (ws[0] + 1) * j +
                                (ws[0] + 2) * k + (ws[0] + 3) * l;
                        if (weight > w)
                            continue;
                        tmp = 0;
                        for (int m = 0; m < i; m++) {
                            tmp += is.get(0).get(m);
                        }
                        for (int m = 0; m < j; m++) {
                            tmp += is.get(1).get(m);
                        }
                        for (int m = 0; m < k; m++) {
                            tmp += is.get(2).get(m);
                        }
                        for (int m = 0; m < l; m++) {
                            tmp += is.get(3).get(m);
                        }
                        ans = Long.max(ans, tmp);
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
