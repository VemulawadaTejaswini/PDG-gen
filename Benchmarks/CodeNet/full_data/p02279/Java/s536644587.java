import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Node {
    Integer id;
    Integer parentId;
    Integer depth;
    Integer type;
    List<Integer> childrenIds;
}


class Main {
    static Map<Integer, Node> nodes = new HashMap<>();

    static final Map<Integer, String> types = new HashMap<Integer, String>() {
      {
          put(1, "root");
          put(2, "internal node");
          put(3, "leaf");
      }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer id = sc.nextInt();
            int m = sc.nextInt();
            List<Integer> childrenIds = new ArrayList<>();
            Node node = getNode(i, id);

            for (int j = 0; j < m; j++) {
                Node childrenNode = new Node();
                Integer childrenId = sc.nextInt();
                childrenNode.id = childrenId;
                childrenNode.parentId = node.id;
                childrenNode.depth = node.depth + 1;
                childrenIds.add(childrenId);
                nodes.put(childrenId, childrenNode);
            }
            node.childrenIds = childrenIds;

            if (m == 0 && i != 0) {
                node.type = 3;
            } else if (i != 0) {
                node.type = 2;
            }
        }

        for (Integer i = 0; i < n; i++) {
            Node node = nodes.get(i);
            System.out.printf("node %d: parent = %d, depth = %d, %s, [%s]\n",
                    node.id,
                    node.parentId,
                    node.depth,
                    types.get(node.type),
                    node.childrenIds.stream().map(elm -> elm.toString()).collect(Collectors.joining(", ")));

        }
    }

    public static Node getNode(int i, Integer id) {
        if (i == 0) {
            Node node = new Node();
            node.id = id;
            node.depth = 0;
            node.parentId = -1;
            node.type = 1;
            nodes.put(id, node);
            return node;
        }
        return nodes.get(id);
    }
}

