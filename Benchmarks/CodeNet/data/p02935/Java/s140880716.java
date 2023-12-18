import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer N = Integer.parseInt(sc.nextLine());
        String[] VN = sc.nextLine().split(" ");

        // 重複を混ぜると価値が下がるのでセットで保持る
        Set<Integer> valueSet = new TreeSet<>();
        for (String v : VN) {
            int vi = Integer.parseInt(v);
            valueSet.add(vi);
        }

        valueSet.stream().sorted();

        // 貪欲法で解いていく
        double ans = mix(valueSet);
        System.out.println(ans);
    }

    private static double mix(Set<Integer> valueSet) {
        if (valueSet.size() == 1) {
            for (int v : valueSet) {
                return v;
            }
        }

        double tmp = 0d;
        for (int val : valueSet) {
            double vald = (double) val;
            if (tmp == 0) {
                tmp = vald;
            } else {
                tmp = mixIn(tmp, vald);
            }
        }
        return tmp;
    }

    private static double mixIn(double tmp, double val) {
        return (tmp + val) / 2;
    }
}
