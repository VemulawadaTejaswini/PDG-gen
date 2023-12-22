import java.util.*;
import java.io.*;

class MSTOJ {

    static class UnionFind {

        // find which set that a is belonging to
        public static String find(Map<String, String> father, String a) {
            String parent = father.get(a);
            while (!father.get(parent).equals(parent)) {
                parent = father.get(parent);
            }

            String node = a;
            while (!father.get(node).equals(parent)) {
                String next = father.get(node);
                father.put(node, parent);
                node = next;
            }

            return parent;
        }

        // union a and b if they are not in the same set
        public static boolean union(Map<String, String> father, String a, String b) {
            String father_a = find(father, a);
            String father_b = find(father, b);
            if (father_a.equals(father_b)) {
                return false;
            }
            father.put(father_a, father_b);
            return true;
        }
    }

    static class Connection {
        String node1;
        String node2;
        int cost;

        public Connection(String a, String b, int c) {
            node1 = a;
            node2 = b;
            cost = c;
        }
    }

    public static int getLowCost(ArrayList<Connection> connections, int n) {
        if (connections == null || connections.size() == 0) {
            // return new ArrayList<Connection>();
            return -1;
        }

        Collections.sort(connections, new Comparator<Connection>() {
            @Override
            public int compare(Connection o1, Connection o2) {
                return o1.cost - o2.cost;
            }
        });

        // Init hash map
        Map<String, String> father = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String city = String.valueOf(i);
            father.put(city, city);
        }

        int sum = 0;
        for (Connection connection : connections) {
            if (UnionFind.union(father, connection.node1, connection.node2)) {
                sum += connection.cost;
            }
        }

        // Check whether there is invalid
        String parent = UnionFind.find(father, connections.get(0).node1);
        for (String node : father.keySet()) {
            if (!UnionFind.find(father, node).equals(parent)) {
                // return new ArrayList<Connection>();
                return -1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Connection> connections = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);
            for (int i = 0 ; i < m; i++) {
                String[] line = br.readLine().split(" ");
                connections.add(new Connection(line[0], line[1], Integer.parseInt(line[2])));
            }
            int result = getLowCost(connections, n);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}