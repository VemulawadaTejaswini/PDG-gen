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

            Node node = nodes.get(id);
            if (node == null) {
                node = new Node();
                node.id = id;
                node.type = 1;
                node.depth = 0;
                node.parentId = -1;
                nodes.put(id, node);
            } else if (m != 0) {
                node.type = 2;
            } else {
                node.type = 3;
            }

            List<Integer> childrenIds = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                Integer childrenId = sc.nextInt();
                Node childrenNode = nodes.get(childrenId);
                if (childrenNode == null) {
                    childrenNode = new Node();
                    childrenNode.id = childrenId;
                    nodes.put(childrenId, childrenNode);
                }
                childrenNode.parentId = node.id;
                childrenNode.depth = node.depth + 1;
                if (childrenNode.childrenIds == null || childrenNode.childrenIds.isEmpty()) {
                    childrenNode.type = 3;
                } else {
                    childrenNode.type = 2;
                }
                childrenIds.add(childrenId);
            }
            node.childrenIds = childrenIds;
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
}

