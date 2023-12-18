import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ns = sc.nextLine();
        String[] h = ns.split(" ");
        List<Node> list = new ArrayList<>();
        list.add(new Node(0));
        int N = Integer.parseInt(h[0]);
        int Q = Integer.parseInt(h[1]);
        for (int i = 1; i <= N; i++) {
            list.add(new Node(i));
        }
        
        //ノードの連結部分の処理
        for (int i = 0; i < N - 1; i++) {
            String in = sc.nextLine();
            String[] inputs = in.split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            list.get(a).addChild(list.get(b));
        }
        
        for (int i = 1; i <= Q; i++) {
            String input = sc.nextLine();
            String[] inputs = input.split(" ");
            int nodeId = Integer.parseInt(inputs[0]);
            int addCount = Integer.parseInt(inputs[1]);
            Node node = list.get(nodeId);
            node.addCount(addCount);
        }
        
        list.remove(0);
        String result = list.stream().map(n -> String.valueOf(n.count)).collect(Collectors.joining(" "));
        System.out.println(result);
    }
    
    static class Node {
        int id;
        long count;
        List<Node> children = new ArrayList<Main.Node>();;
        
        Node(int id) {
            this.id = id;
            this.count = 0;
        }
        
        public void addChild(Node node) {
            children.add(node);
        }
        
        public void addCount(long count) {
            this.count += count;
            for (Node node : this.children) {
                node.addCount(count);
            }
        }
        
        @Override
        public String toString() {
            return String.valueOf(this.id) + this.count;
        }
    }
}
