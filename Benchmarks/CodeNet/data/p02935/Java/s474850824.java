import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();

        List<Double> v = new ArrayList<>();
        for (int i=0; i < n; i++)
            v.add((double) in.nextInt());

        while (v.size() > 1) {
            v.sort(((o1, o2) -> {
                if (o1 > o2) return 1;
                else if (o1 < o2) return -1;
                return 0;
            }));

            double v1 = v.get(0);
            double v2 = v.get(1);
            v.remove(0);
            v.remove(0);
            v.add((v1 + v2) / 2);
        }

        out.println(v.get(0));
    }

}
