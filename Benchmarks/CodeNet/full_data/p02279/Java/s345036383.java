import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashMap<Integer, TreeNode> nodes = new HashMap<>();
        int rootID = 0;
        ArrayList<Integer> notRoots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String treeString = in.readLine();
            String[] data = treeString.split(" ");
            int id = Integer.parseInt(data[0]);
            int degree = Integer.parseInt(data[1]);
            int[] children = new int[degree];
            for (int j = 0; j < degree; j++) {
                children[j] = Integer.parseInt(data[j+2]);
                notRoots.add(children[j]);
            }
            TreeNode node = new TreeNode(id, degree, children);
            nodes.put(node.id, node);
        }
        notRoots.sort(Integer::compareTo);
        for (Integer i : notRoots) {
            if (rootID == i) {
                rootID++;
            }
        }
        updateNodes(nodes, rootID, -1, 0);

        int id = 0;
        TreeNode node = nodes.get(id);
        while (node != null) {
            System.out.println("node " + id + ": parent = " + node.parent + ", depth = " + node.depth + ", "
                    + node.getType() + ", " + Arrays.toString(node.children));
            node = nodes.get(++id);
        }
    }

    private static void updateNodes(HashMap<Integer, TreeNode> nodes, int currentID, int parent, int depth) {
        TreeNode node = nodes.get(currentID);
        node.parent = parent;
        node.depth = depth;
        if (!node.isLeaf()) {
            for (int child : node.children) {
                updateNodes(nodes, child, currentID, depth+1);
            }
        }
    }
}

class TreeNode {
    int id;
    int degree;
    int[] children;
    int parent;
    int depth;

    public TreeNode(int id, int degree, int[] children) {
        this.id = id;
        this.degree = degree;
        this.children = children;
    }

    boolean isLeaf() {
        return degree == 0;
    }

    String getType() {
        if (depth == 0) {
            return "root";
        } else if (isLeaf()) {
            return "leaf";
        } else {
            return "internal node";
        }
    }
}

