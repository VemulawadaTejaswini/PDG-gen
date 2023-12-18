import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        ArrayList<Pair> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int y = sc.nextInt();
            map.put(y, p);
            list.add(new Pair(p, y));
        }
        HashMap<Integer, Integer> order = new HashMap<>();
        int[] count = new int[n];
        for(int key: map.keySet()) {
            int value = map.get(key);
            int currentCount = ++count[value-1];
            order.put(key, currentCount);
        }
        for(Pair pair: list) {
            int p = pair.p;
            int y = pair.y;
            int o = order.get(y);
            System.out.println(String.format("%06d", p) + String.format("%06d", o));
        }
    }

    static class Pair {
        int p;
        int y;
        Pair(int p, int y) {
            this.p = p;
            this.y = y;
        }
    }
}
