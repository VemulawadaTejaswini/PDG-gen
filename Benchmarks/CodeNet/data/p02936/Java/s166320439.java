import java.util.*;

public class Main {

    public static int[] countList;
    public static Node[] nodeList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        countList = new int[N];
        nodeList = new Node[N];

        for (int i = 0; i < N; i++) {
            nodeList[i] = new Main.Node();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(nodeList[b - 1].hasParent()){
                nodeList[b - 1].addChildren(a - 1);
            } else {
                nodeList[a - 1].addChildren(b - 1);
            }
            nodeList[b - 1].setHasParent(true);
        }

        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            addCount(p - 1, x);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(countList[i]).append(" ");
        }
        System.out.println(sb.toString());

    }

    public static void addCount(int index, int x){
        countList[index] += x;
        for(int j: nodeList[index].getChildren()){
            addCount(j, x);
        }
    }

    static class Node {

        private List<Integer> children;
        private boolean hasParent = false;

        public Node() {
            children = new LinkedList<>();
        }

        public List<Integer> getChildren() {
            return children;
        }

        public void addChildren(int n) {
            this.children.add(n);
        }

        public boolean hasParent() {
            return hasParent;
        }

        public void setHasParent(boolean hasParent) {
            this.hasParent = hasParent;
        }

    }
}