import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        // 候補の配列
        List<Integer> candidate = new ArrayList<>();
        candidate.add(a);
        candidate.add(b);
        candidate.add(c);
        candidate.add(d);
        candidate.add(e);

        // 順列の配列
        List<Integer> perm = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        make(candidate, perm, ret);

        int ans = Integer.MAX_VALUE;
        for (List<Integer> pattern : ret) {
            int total = 0;
            for (int i = 0; i < pattern.size(); i++) {
                total += pattern.get(i);
                if (total % 10 != 0 && i != pattern.size() - 1) {
                    total += 10 - (total % 10);
                }
            }
            ans = Math.min(ans, total);
        }
        System.out.println(ans);
    }


    private static void make(List<Integer> candidate, List<Integer> perm, List<List<Integer>> ret) {
        if (candidate.size() == 0) {
            ret.add(perm);
        }

        for (int i = 0; i < candidate.size(); i++) {
            List<Integer> p = new ArrayList<>(perm);
            List<Integer> c = new ArrayList<>(candidate);
            p.add(c.get(i));
            c.remove(i);
            make(c, p, ret);
        }
    }
}