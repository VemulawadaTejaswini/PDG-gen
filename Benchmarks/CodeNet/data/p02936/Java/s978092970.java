
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Map<Integer, List<Integer>> edge_;

    static int[] answer_;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer q = Integer.parseInt(scan.next());

        edge_ = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= n; i++) {
            edge_.put(i, new ArrayList<Integer>());
        }

        for (int i = 0; i < n - 1; i++) {
            Integer a = Integer.parseInt(scan.next());
            Integer b = Integer.parseInt(scan.next());
            edge_.get(a).add(b);
        }

        answer_ = new int[n + 1];
        for (int i = 0; i < q; i++) {
            Integer p = Integer.parseInt(scan.next());
            Integer x = Integer.parseInt(scan.next());
            answer_[p] += x;
        }
        scan.close();

        dfs(1);

        for (int i = 1; i <= n; i++) {
            System.out.print(answer_[i]);
            if (i != n) {
                System.out.print(" ");
            }
        }
    }

    private static void dfs(int p) {
        for (Integer i : edge_.get(p)) {
            answer_[i] += answer_[p];
            dfs(i);
        }
    }
}
