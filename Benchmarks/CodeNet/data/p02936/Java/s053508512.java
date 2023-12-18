import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int Q;

        Node[] nodes;
        Operation[] ope;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Q = sc.nextInt();

            nodes = new Node[N];
            ope = new Operation[Q];

            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i+1);
            }

            for(int i = 0; i < N-1; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();

                Edge e = new Edge(a, b);
                nodes[a - 1].edge.add(e);
                nodes[b - 1].edge.add(e);
                nodes[a - 1].nodeList.add(nodes[b - 1]);
                nodes[b - 1].nodeList.add(nodes[a - 1]);
            }

            for(int i = 0; i < Q; i++){
                int p = sc.nextInt();
                int x = sc.nextInt();

                Operation e = new Operation(p, x);
                ope[i] = e;
            }

            for(Operation o :ope){
                int p = o.p;
                int x = o.x;
                nodes[p - 1].addNum += x;
            }

            //深さ優先探索
            Deque<Node> queue = new ArrayDeque<Node>();
            nodes[0].visited = true;
            queue.add(nodes[0]);
            nodes[0].realNUm += nodes[0].addNum;
            Node n = null;
            while ((n = queue.peekLast()) != null) {
                //未訪問の隣接ノードを取得
                Node m = n.getUnVisitNode();
                //隣接ノードあり。
                if(m != null){
                    m.visited = true;
                    queue.add(m);
                    m.realNUm = m.addNum +n.realNUm;
                }else{
                    //隣接ノードなし
                    queue.pollLast();
                }
            }
            StringBuilder sb = new StringBuilder();
            for(Node noo :nodes){
                sb.append(noo.realNUm + " ");
            }
            System.out.println(sb.toString());
        }
    }


    public static class Edge {
        int a;
        int b;
        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static class Node {
        long addNum = 0;
        long realNUm = 0;
        long id;
        boolean visited = false;
        List<Edge> edge = new LinkedList<>();
        List<Node> nodeList = new LinkedList<>();

        public Node(int id){
            this.id = id;
        }

        public Node getUnVisitNode(){
            Node result = null;
            for(Node n : nodeList){
                if(!n.visited){
                    result = n;
                    break;
                }
            }
            return result;
        }

        public void print(){
            System.out.println("["+id+"]:"+addNum +":"+realNUm);
        }

    }

    public static class Operation {
        int p;
        int x;
        public Operation(int p, int x) {
            this.p = p;
            this.x = x;
        }
    }
}
