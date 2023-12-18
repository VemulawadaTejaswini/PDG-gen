import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Node[] tree = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree[a].children.add(tree[b]);
            tree[b].children.add(tree[a]);
        }
        for (int i = 0; i < q; i++) {
            tree[sc.nextInt()].score += sc.nextInt();
        }
        tree[1].calc(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=n; i++) {
            if (i != 1) {
                sb.append(" ");
            }
            sb.append(tree[i].score);
        }
      System.out.println(sb);
    }
    
    static class Node {
        long score = 0;
        HashSet<Node> children = new HashSet<>();
        boolean calced = false;
        
        public void calc(long point) {
            if (calced) {
                return;
            }
            calced = true;
            score += point;
            for (Node n : children) {
                n.calc(score);
            }
        }
    }
}
