import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] aN = new Node[n];
        
        for (int i = 0; i < n; i++) {
            aN[i] = new Node(i, -1, -1, 0, null);
        }
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            int dim = sc.nextInt();
            int[] a = new int[dim];
            for (int j = 0; j < dim; j++) {
                int val2 = sc.nextInt();
                aN[val2].parent = val;
                aN[val2].depth = aN[i].depth + 1;
                a[j] = val2;
            }
            aN[val].dim = dim;
            aN[val].children = a;
        }
        
        for (int i = 0; i < n; i++) {
            String kind = aN[i].parent == -1 ? "root" : aN[i].children.length == 0 ? "leaf" : "internal node";
            String children = getStr(aN[i].children);
            System.out.print(
                    "node " + aN[i].val + ": parent = " + aN[i].parent + ", depth = " + aN[i].depth + 
                    ", " + kind + ", " + children);
            System.out.println();
        }

        System.out.println();
    }
    
    private static String getStr(int[] a) {
        // TODO 自動生成されたメソッド・スタブ
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(a[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static class Node {
        int val;
        int dim;
        int parent;
        int depth;
        int[] children;
        public Node(int val, int dim, int parent, int depth, int[] children) {
            this.val = val;
            this.dim = dim;
            this.parent = parent;
            this.depth = depth;
            this.children = children;
        }
    }
}

