import java.util.*;

public class Main {

    public static int[] countList;
    public static List<Node> nodeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        countList = new int[N];

        for (int i = 0; i < N; i++) {
            nodeList.add(new Main.Node());
        }

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodeList.get(a - 1).addChildren(b - 1);
        }

        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            addCount(p - 1, x);
        }

        String ans = "" + countList[0];
        for (int i = 1; i < N; i++) {
            ans += " " + countList[i];
        }
        System.out.println(ans);

    }

    public static void addCount(int index, int x){
        countList[index] += x;
        for(int j: nodeList.get(index).getChildren()){
            addCount(j, x);
        }
    }

    static class Node {

        private List<Integer> children;

        public Node() {
            children = new LinkedList<>();
        }

        public List<Integer> getChildren() {
            return children;
        }

        public void addChildren(int n) {
            this.children.add(n);
        }

    }
}