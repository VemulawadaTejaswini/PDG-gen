import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<Integer, Peak> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            long h = scanner.nextInt();
            map.put(i, new Peak(i, h));
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Peak peaka = map.get(a); // a -> b
            peaka.addRoute(b);

            Peak peakb = map.get(b); // b -> a
            peakb.addRoute(a);
        }


        int count = 0;
        for (Peak peak : map.values()) {
            if (peak.routes.size() == 0) {
                count++;
            } else {

                boolean higher = true;
                for (int targetId : peak.routes) {
                    Peak target = map.get(targetId);

                    if (peak.h <= target.h) {
                        higher = false;
                        break;
                    }
                }
                if (higher) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    static class Peak {
        int id;
        long h;
        Set<Integer> routes;

        public Peak(int id, long h) {
            this.id = id;
            this.h = h;
            routes = new HashSet<>();
        }

        public void addRoute(int b) {
            routes.add(b);
        }

        @Override
        public String toString() {
            return this.id + ":" + this.h + ":" + this.routes;
        }
    }
}