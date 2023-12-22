import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Node {
    public int parent;
    public int left;
    public int right;
}

public class Main implements Runnable {
    static final int MAX = 100005;
    static final int NIL = -1;
    Node[] T = new Node[MAX];
    int[] D = new int[MAX];

    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        // 入力
        int nodeTotalCount = 0;
        int id;
        int degree;
        int child;
        int sibling = 0;
        int root = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            nodeTotalCount = Integer.parseInt(br.readLine());
            for (int i = 0; i < nodeTotalCount; i++) {
                T[i] = new Node();
                T[i].parent = T[i].left = T[i].right = NIL;
            }
            for (int i = 0; i < nodeTotalCount; i++) {
                String line = br.readLine();
                String[] tokens = line.split(" ");
                id = Integer.parseInt(tokens[0]);
                degree = Integer.parseInt(tokens[1]);
                for (int j = 0; j < degree; j++) {
                    child = Integer.parseInt(tokens[2 + j]);
                    if (j == 0) {
                        // leftはT[i]の子
                        T[id].left = child;
                    } else {
                        // rightはT[sibling]の兄弟
                        T[sibling].right = child;
                    }
                    sibling = child;
                    T[child].parent = id;
                }
            }

            for (int i = 0; i < nodeTotalCount; i++) {
                if (T[i].parent == NIL) {
                    root = i;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 深さ
        setDepth(root, 0);

        // 出力
        for (int i = 0; i < nodeTotalCount; i++) {
            print(i);
        }
    }

    void print(int id) {
        StringBuilder sb = new StringBuilder();
        sb.append("node ").append(id);
        sb.append(": parent = ").append(T[id].parent);
        sb.append(", depth = ").append(D[id]).append(", ");

        if (T[id].parent == NIL) {
            sb.append("root, [");
        } else if (T[id].left == NIL) {
            sb.append("leaf, [");
        } else {
            sb.append("internal node, [");
        }

        for (int i = 0, child = T[id].left; child != NIL; i++, child = T[child].right) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(child);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    void setDepth(int id, int depth) {
        D[id] = depth;
        if (T[id].right != NIL) {
            setDepth(T[id].right, depth);
        }
        if (T[id].left != NIL) {
            setDepth(T[id].left, depth + 1);
        }
    }
}

