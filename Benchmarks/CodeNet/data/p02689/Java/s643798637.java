import java.util.*;
import java.util.List;

public class Main {
    // l, r in [0, 100]
    static int getKey(int l, int r) {
        return l > r ? l * 1000 + r : r * 1000 + l;
    }

    static List<Integer> hs;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main.hs = new ArrayList<>();
        int n = scan.nextInt();
        int nEdge = scan.nextInt();
        for (int i = 0; i < n; i++) {
            hs.add(scan.nextInt());
        }
        Map<Integer, Set<Integer>> neighbours = new HashMap<>();
        for (int i = 0; i < nEdge; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            neighbours.computeIfAbsent(l, HashSet::new);
            neighbours.computeIfAbsent(r, HashSet::new);
            neighbours.get(l).add(r);
            neighbours.get(r).add(l);
        }
        scan.close();
        hs.sort(Integer::compareTo);

        long cnt =
                neighbours.entrySet().stream().filter(Main::isGood).count();

        System.out.println(cnt);
    }

    static boolean isGood(Map.Entry<Integer, Set<Integer>> entry) {
        if (entry.getValue().size() == 0) {
            return true;
        }
        int idx = Main.hs.indexOf(entry.getKey());
        for (int key : entry.getValue()) {
            if (idx <= Main.hs.indexOf(key)) {
                return false;
            }
        }
        return true;
    }
}

