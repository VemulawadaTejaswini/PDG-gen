
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        List<Long> leaf = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            leaf.add(sc.nextLong());
        }

        if (n == 1 && leaf.get(0) != 1) {
            System.out.println(-1);
            return;
        }

        List<Long> accLeaf = new ArrayList<>();
        accLeaf.add(0L);
        long acc  = 0L;
        for (int i = 0; i < n; i++) {
            acc += leaf.get(i);
            accLeaf.add(acc);
        }

        long  ans = 1;
        long  nonLeaf;
        long  vertexes = 1;
        for (int i = 1; i < n; i++) {
            nonLeaf = vertexes - leaf.get(i-1);
            vertexes = Math.min(2*nonLeaf, accLeaf.get(n)-accLeaf.get(i));
            if (vertexes <= 0) {
               System.out.println(-1);
               return;
            }
            ans += vertexes;
        }

        System.out.println(ans);
    }
}
