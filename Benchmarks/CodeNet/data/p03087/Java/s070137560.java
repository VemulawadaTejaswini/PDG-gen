import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        List<Boolean> ac = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            l.add(sc.nextInt());
            r.add(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            if ("A".equals(str[i]) && "C".equals(str[i + 1])) {
                ac.add(true);
                continue;
            }
            ac.add(false);
        }
        for (int i = 0; i < q; i++) {
            long count = 0l;
            for (int j = l.get(i) - 1; j < r.get(i) - 1; j++) {
                if (j >= n - 1) {
                    continue;
                }
                if (ac.get(j)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}
