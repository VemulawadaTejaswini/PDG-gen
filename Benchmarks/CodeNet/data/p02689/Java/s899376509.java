import java.util.*;
import java.util.List;

public class Main {
    static Map<Integer, Integer> hs;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main.hs = new HashMap<>();
        int n = scan.nextInt();
        int nEdge = scan.nextInt();
        for (int i = 0; i < n; i++) {
            hs.put(i + 1, scan.nextInt());
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

        long cnt =
                neighbours.entrySet().stream().filter(Main::isGood).count();

        System.out.println(cnt);
    }

    static boolean isGood(Map.Entry<Integer, Set<Integer>> entry) {
        if (entry.getValue().size() == 0) {
            return true;
        }
        int height = Main.hs.get(entry.getKey());
        for (int key : entry.getValue()) {
            if (height <= Main.hs.get(key)) {
                return false;
            }
        }
        return true;
    }
}

