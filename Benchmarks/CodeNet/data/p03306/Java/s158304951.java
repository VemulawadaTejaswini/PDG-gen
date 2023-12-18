import java.util.*;

class Main {
    static List<Node> nodes = new ArrayList<>();

    static class Node {
        Map<Integer, Integer> neighbors = new HashMap<>();
        int min = 1;
        int max = 999999999;
        boolean defined = false;

        void init() {
            for (int s: neighbors.values()) {
                if (s-1 < max) max = s-1;
            }
        }

        int trace(int low, int high) {
            if (defined) {
                return setLen(low, high) ? max - min + 1: 0;
            }
            defined = true;
            init();
            if (!setLen(low, high)) {
                return 0;
            }

            int retMin = max - min + 1;
            for (Map.Entry<Integer, Integer> n: neighbors.entrySet()) {
                int s = n.getValue();
                int ret = nodes.get(n.getKey()).trace(s - max, s - min);
                retMin = Math.min(retMin, ret);
            }
            return retMin > 0 ? retMin : 0;
        }

        boolean setLen(int low, int high) {
            min = Math.max(min, low);
            max = Math.min(max, high);
            return min <= max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        for (int i=0; i<n; i++) {
            nodes.add(new Node());
        }

        for (int i=0; i<m; i++) {
            int ui = Integer.parseInt(sc.next());
            int vi = Integer.parseInt(sc.next());
            int si = Integer.parseInt(sc.next());
            nodes.get(ui-1).neighbors.put(vi-1, si);
            nodes.get(vi-1).neighbors.put(ui-1, si);
        }

        System.out.println(nodes.get(0).trace(1, 999999999));
    }
}