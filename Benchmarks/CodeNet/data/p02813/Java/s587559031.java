import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        final int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }

        List<List<Integer>> list = new ArrayList<>();

        perm(IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList()), new ArrayList<>(), list);

        List<Integer> lp = IntStream.of(p).boxed().collect(Collectors.toList());
        List<Integer> lq = IntStream.of(q).boxed().collect(Collectors.toList());

        int np = 0;
        int nq = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().equals(lp.toString())) np = i + 1;
            if (list.get(i).toString().equals(lq.toString())) nq = i + 1;
        }

        System.out.println(Math.abs(np - nq));
    }

    private static void perm(List<Integer> candidate, List<Integer> perm, List<List<Integer>> perms) {
        if (candidate.size() == 0) {
            perms.add(perm);
        }
        for (int i = 0; i < candidate.size(); i++) {
            List<Integer> c = new ArrayList<>(candidate);
            List<Integer> p = new ArrayList<>(perm);
            p.add(c.get(i));
            c.remove(i);
            perm(c, p, perms);
        }
    }
}
