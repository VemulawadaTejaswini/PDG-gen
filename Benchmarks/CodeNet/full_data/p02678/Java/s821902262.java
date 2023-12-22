import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<Integer, Room> map = new HashMap<>();
        Map<Integer, Room> labeled = new HashMap<>();

        for (int i = 1; i <= m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            // from -> to
            addRoute(map, labeled, from, to);
            // to -> from
            addRoute(map, labeled, to, from);
        }

        Room root = map.get(1);
        addLabel(map, labeled, 1, root.routes, 2, n);

        if (labeled.size() == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        for (int num = 2; num <= n; num++) {
            Room room = map.get(num);
            System.out.println(room.label);
        }
    }

    static void addLabel(Map<Integer, Room> map, Map<Integer, Room> labeled, int source, List<Integer> routes, int depth, int n) {
        if (depth >= n || labeled.size() == n) {
            return;
        }
        for (int number : routes) {
            Room r = map.get(number);
            if (!r.isLabeled()) {
                r.label = source;
                labeled.put(r.number, r);
            }

            addLabel(map, labeled, r.number, r.routes, depth + 1, n);
        }
    }

    static void addRoute(Map<Integer, Room> map, Map<Integer, Room> labeled, int from, int to) {
        if (!map.containsKey(from)) {
            map.put(from, new Room(from));
        }
        Room room = map.get(from);
        room.addRoute(to);
        if (room.isLabeled()) {
            labeled.put(room.number, room);
        }
    }

    static class Room {
        int number;
        List<Integer> routes;
        int label = -1;

        public Room(int number) {
            this.number = number;
            routes = new ArrayList<>();
            if (number == 1) {
                label = 0;
            }
        }

        public void addRoute(Integer route) {
            this.routes.add(route);
            if (route == 1) {
                label = 1;
            }
        }

        public boolean isLabeled() {
            return label >= 0;
        }

        public String toString() {
            return number + ":" + routes + ":" + label;
        }
    }

}