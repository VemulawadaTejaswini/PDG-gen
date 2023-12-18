import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        
        String l1 = bi.readLine();
        String[] params = l1.split(" ");
        int N = Integer.parseInt(params[0]);
        int Q = Integer.parseInt(params[1]);

        Node[] nodes = new Node[N];
        for (int i = 0; i < N; ++i) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < N - 1; ++i) {
            String l2 = bi.readLine();
            String[] params2 = l2.split(" ");
            
            int a = Integer.parseInt(params2[0]) - 1;
            int b = Integer.parseInt(params2[1]) - 1;
            
            Node nodeA = nodes[a];
            Node nodeB = nodes[b];
            
            nodeA.children.add(nodeB);
        }
        
        for (int i = 0; i < Q; ++i) {
            String l2 = bi.readLine();
            String[] params2 = l2.split(" ");
            int n = Integer.parseInt(params2[0]) - 1;
            int score = Integer.parseInt(params2[1]);
            
            nodes[n].value += score;
        }
        
        search(nodes[0]);

        String result = Arrays.stream(nodes).map(n -> Integer.toString(n.value)).collect(Collectors.joining(" "));
        System.out.println(result);
    }
    
    public static void search(Node node) {
        for (Node c : node.children) {
            c.value += node.value;
            search(c);
        }
    }
    
    
    static class Node {
        int value;
        List<Node> children = new ArrayList<>();
    }
}
