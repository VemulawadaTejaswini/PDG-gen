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
        boolean rootFlg = true;
        for (int i = 0; i < n; i++) {
            Integer id = sc.nextInt();
            Node node = nodes.get(id);
            int m = sc.nextInt();
            List<Integer> childrenIds = new ArrayList<>();
            if (node == null) {
                node = new Node();
                node.id = id;
                nodes.put(id, node);
            }

            if (m != 0 && rootFlg) {
                node.parentId = -1;
                node.depth = 0;
                node.type = 1;
                rootFlg = false;
            } else if (m == 0) {
                node.type = 3;
            } else {
                node.type = 2;
            }

            for (int j = 0; j < m; j++) {
                Integer childrenId = sc.nextInt();
                Node childrenNode = nodes.get(childrenId);
                if (childrenNode == null) {
                    childrenNode = new Node();
                    childrenNode.id = childrenId;
                    nodes.put(childrenId, childrenNode);
                }
                childrenNode.depth = node.depth + 1;
                childrenNode.parentId = node.id;
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

