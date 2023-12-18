
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int n;
    static List<Node> nodes;
    static int[] l;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nodes = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            nodes.add(new Node(i));
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes.get(a).next.add(nodes.get(b));
            nodes.get(b).next.add(nodes.get(a));
        }
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        List<Integer> lList = new ArrayList<>();
        for (int i = 0; i < nodes.get(1).next.size(); i++) {
            l = new int[n + 1];
            while (q.size() > 0) {
                int next = q.poll();
                for (Node node : nodes.get(next).next) {
                    if (l[node.num] != 0) continue;
                    l[node.num] = l[next] + 1;
                    q.add(node.num);
                }
            }
            lList.add(IntStream.of(l).max().getAsInt());
        }
        int size= 0;
        if(lList.size() == 1) {
            size= lList.get(0)+1;
        }
        else {
            lList.sort(Integer::compareTo);
            size = lList.get(lList.size()-1) +11;
            size += lList.get(lList.size()-2)+1;
        }
        if((size + 1) % 3 == 0) {
            System.out.println("Second");
        }
        else {
            System.out.println("First");
        }
    }

    static class Node {
        public int num;
        public List<Node> next;

        public Node(int num) {
            this.num = num;
            next = new ArrayList<>();
        }
    }
}
