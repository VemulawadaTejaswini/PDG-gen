import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            int id = input.nextInt();
            Node node = new Node(id);
            int k = input.nextInt();
            for (int j = 0; j < k; j++) {
                int c = input.nextInt();
                node.addChild(c);
            }
            nodes[id] = node;
        }
        for (Node node : nodes) {
            updateNodes(node, nodes);
        }
        for (Node node : nodes) {
            System.out.println(node);
        }
    }
    
    private void updateNodes(Node node, Node[] nodes) {
        if (node.hasChild() == false) return;
        for (int c : node.getChild()) {
            nodes[c].setParent(node.getId());
            nodes[c].setDepth(node.getDepth()+1);
            updateNodes(nodes[c], nodes);
        }
    }
    
    private static class Node {
        int id;
        List<Integer> cs = new ArrayList<Integer>();
        int parent = -1;
        int depth = 0;
        Node(int id) {
            this.id = id;
        }
        int getId() {
            return id;
        }
        void addChild(int c) {
            cs.add(c);
        }
        int[] getChild() {
            int[] ret = new int[cs.size()];
            for (int i = 0; i < cs.size(); i++) {
                ret[i] = cs.get(i);
            }
            return ret;
        }
        boolean hasChild() {
            return cs.isEmpty() == false;
        }
        int getParent() {
            return parent;
        }
        void setParent(int parent) {
            this.parent = parent;
        }
        int getDepth() {
            return depth;
        }
        void setDepth(int depth) {
            this.depth = depth;
        }
        @Override public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("node ").append(id).append(": ");
            sb.append("parent = ").append(parent).append(", ");
            sb.append("depth = ").append(depth).append(", ");
            if (depth == 0) sb.append("root, [");
            else if (hasChild()) sb.append("internal node, [");
            else sb.append("leaf, [");
            boolean first = true;
            for (int c : cs) {
                if (first == false) {
                    sb.append(", ");
                }
                first = false;
                sb.append(c);
            }
            sb.append("]");
            return sb.toString();
        }
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() {
            nextToken();
            return st.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
        
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}